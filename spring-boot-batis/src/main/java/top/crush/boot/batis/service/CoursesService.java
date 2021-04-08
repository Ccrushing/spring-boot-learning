package top.crush.boot.batis.service;

import com.github.pagehelper.PageInfo;
import top.crush.boot.batis.domain.Courses;

public interface CoursesService {
    /**
     * 查询所有（分页）
     *
     * @param pageNum 页码
     * @param pageSize 每页的数量
     * @return pageInfo
     */
    PageInfo<Courses> findByPage(int pageNum,int pageSize);
}
