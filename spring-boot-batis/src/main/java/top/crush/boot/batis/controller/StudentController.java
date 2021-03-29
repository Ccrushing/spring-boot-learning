package top.crush.boot.batis.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.crush.boot.batis.controller.dto.AjaxResponse;
import top.crush.boot.batis.mapper.StudentMapper;

import javax.annotation.Resource;

/**
 * @author Crush
 * @date 2021/3/25
 * @dercsiption StudentController
 */
@RestController
@RequestMapping(value = "api/student")
@Slf4j
public class StudentController {
    @Resource
    private StudentMapper studentMapper;

    @GetMapping("{id}")
    public AjaxResponse getStu (@PathVariable("id") int id) {

        return AjaxResponse.success(studentMapper.getStudent(id));
    }
}
