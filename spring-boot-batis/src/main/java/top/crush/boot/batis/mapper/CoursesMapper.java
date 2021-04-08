package top.crush.boot.batis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.pagehelper.Page;
import top.crush.boot.batis.domain.Courses;

public interface CoursesMapper extends BaseMapper<Courses> {
    /**
     * 查询所有记录
     *
     * @return page
     */
    Page<Courses> findAll();
}