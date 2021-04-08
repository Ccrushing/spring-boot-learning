package crush.top.boot.mbp.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import crush.top.boot.mbp.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {


    List<User> findUser(@Param("name") String name,
                        @Param("email") String email);

    List<User>selectAll(@Param(Constants.WRAPPER) Wrapper
                                wrapper);
}