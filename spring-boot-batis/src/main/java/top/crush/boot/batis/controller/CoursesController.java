package top.crush.boot.batis.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.crush.boot.batis.domain.Courses;
import top.crush.boot.batis.service.CoursesService;

import javax.annotation.Resource;

/**
 * @author Crush
 * @date 2021/4/1
 * @dercsiption CoursesController
 */
@RestController
@RequestMapping("api/mbp")
public class CoursesController {
    @Resource
    private CoursesService coursesService;

    @PostMapping("page")
    public PageInfo<Courses> getByPage(@RequestParam(name = "pageNum",defaultValue = "1",required = false) int pageNum,
                                       @RequestParam(name = "pageSize",defaultValue = "10",required = false) int pageSize)
    {
        return coursesService.findByPage(pageNum,pageSize);
    }
}
