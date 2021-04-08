package top.crush.boot.batis.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import top.crush.boot.batis.domain.Courses;
import top.crush.boot.batis.mapper.CoursesMapper;
import top.crush.boot.batis.service.CoursesService;

import javax.annotation.Resource;

/**
 * @author Crush
 * @date 2021/4/1
 * @dercsiption CoursesServiceImpl
 */
public class CoursesServiceImpl implements CoursesService {
    @Resource
    private CoursesMapper coursesMapper;
    @Override
    public PageInfo<Courses> findByPage(int pageNum, int pageSize) {
        //将所有参数传给这个方法就可以实现物理分页
        PageHelper.startPage(pageNum,pageSize);
        //根据用户id查询所有数据
        Page<Courses> coursesPage = coursesMapper.findAll();
        //将这些作为入参结构建出pageInfo（包含了总页数，当前页码，每页数量，当前也list等一堆属性方法）
        return new PageInfo<>(coursesPage);
    }
}
