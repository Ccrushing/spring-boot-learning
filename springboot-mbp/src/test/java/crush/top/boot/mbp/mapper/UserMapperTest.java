package crush.top.boot.mbp.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import crush.top.boot.mbp.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ExtendWith(SpringExtension.class)

class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
        void save() {

        User user = User.builder()
                   .name("Rose")
                   .age(19)
                   .email("rose@baomidou.com")
                   .build();

        int row = userMapper.insert(user);
        assertEquals(1, row);

        System.out.println("雪花算法id: " + user.getId());
    }

    @Test
    void deleteById() {
        int rows = userMapper.deleteById(1);
        System.out.println("影响记录数" + rows);
    }

    @Test
    void updateById() {
        User user = new User();
        user.setId(222222222222L);
        user.setAge(20);
        user.setEmail("123456.com");
        int rows = userMapper.updateById(user);
        System.out.println("影响记录：" + rows);
    }

    @Test
    void selectById(){
        User user = userMapper.selectById(111111111);
        System.out.println(user);
    }

    @Test
    void like(){
        String name="Jack";
        String email="";
        QueryWrapper<User> query=new QueryWrapper<>();
        query.like(StringUtils.isNotBlank(name), "name", name)
                .
                        like(StringUtils.isNotBlank(email), "email", email);
        List<User> list=userMapper.selectList(query);
        list.forEach(System.out::println);
    }

    @Test
    void allEq(){
        QueryWrapper<User>query=new QueryWrapper<>();
        Map<String, Object> params=new HashMap<>();
        params.put("name", "Jack");
        params.put("age", 18);
        params.put("email", null);
        query.allEq((k, v) ->!k.equals("name"), params, false);
        List<User>list=userMapper.selectList(query);
        list.forEach(System.out::println);
    }

    @Test
    void lambda(){
        LambdaQueryWrapper<User> lambdaQ= Wrappers.lambdaQuery();
        lambdaQ.like(User::getName, "Jack")
                .
                        lt(User::getAge, 18);
        List<User>list=userMapper.selectList(lambdaQ);
    }

    @Test
    void lambda1(){
        List<User>list=new LambdaQueryChainWrapper<User>
                (userMapper)
                        .likeRight(User::getName, "Jack")
                        .and(q ->q.lt(User::getAge, 40)
                                        .or()
                                        .isNotNull(User::getEmail)
                                )
                        .list();
        list.forEach(System.out::println);
    }

    @Test
    public void testCustomSQL() {
        String name="Jack";
        String email="";
        List<User>list=userMapper.findUser(name,email);
        list.forEach(System.out::println);

    }

    @Test
    public void testCustomSQL2() {
        LambdaQueryWrapper<User>query=new
                LambdaQueryWrapper<>();
        query.eq(User::getName, "Jack");
        List<User>list=userMapper.selectAll(query);
        list.forEach(System.out::println);
    }

    @Test
    public void testSelectByPage1() {
        LambdaQueryWrapper<User>query=new
                LambdaQueryWrapper<>();
        query.ge(User::getAge, 10)
                .
                        orderByDesc(User::getAge);
        Page<User> page=new Page<>(1, 5);
        userMapper.selectPage(page, query);
        System.out.println("总⻚数："+page.getPages());
        System.out.println("总记录数："+page.getTotal());
        List<User>list=page.getRecords();
        list.forEach(System.out::println);
    }

    @Test
    public void testSelectByPage() {
        LambdaQueryWrapper<User>query=new
                LambdaQueryWrapper<>();
        query.ge(User::getAge, 10)
                .
                        orderByDesc(User::getAge);
        Page<User>page=new Page<>(1, 5, false);
        userMapper.selectPage(page, query);
        System.out.println("总⻚数："+page.getPages());
        System.out.println("总记录数："+page.getTotal());
        List<User>list=page.getRecords();
        list.forEach(System.out::println);
    }

}