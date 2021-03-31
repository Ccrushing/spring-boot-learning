package crush.top.boot.mbp.mapper;

import crush.top.boot.mbp.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

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
        System.out.println("影响记录" + rows);
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

}