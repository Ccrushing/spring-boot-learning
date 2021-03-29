package top.crush.boot.batis.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.crush.boot.batis.controller.dto.AjaxResponse;
import top.crush.boot.batis.mapper.CourseMapper;

import javax.annotation.Resource;

/**
 * @author Crush
 * @date 2021/3/25
 * @dercsiption CourseController
 */
@RestController
@RequestMapping(value = "api/course")
@Slf4j
public class CourseController {
    @Resource
    private CourseMapper courseMapper;

    @GetMapping("all")
    public AjaxResponse getCourseList() {
        return AjaxResponse.success(courseMapper.selectAll());
    }
}
