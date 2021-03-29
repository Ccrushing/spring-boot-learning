package top.crush.boot.batis.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.crush.boot.batis.controller.dto.AjaxResponse;
import top.crush.boot.batis.mapper.ClazzMapper;

import javax.annotation.Resource;

/**
 * @author Crush
 * @date 2021/3/25
 * @dercsiption ClazzController
 */
@RestController
@RequestMapping(value = "api/course")
@Slf4j
public class ClazzController {
    @Resource
    private ClazzMapper clazzMapper;


    @GetMapping("{id}")
    public AjaxResponse getClazz(@PathVariable("id") int id) {
        return AjaxResponse.success(clazzMapper.getClazz(id));
    }
}
