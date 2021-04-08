package top.crush.boot.batis.service;

import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import top.crush.boot.batis.domain.Courses;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CoursesServiceTest {
    @Resource
    private CoursesService coursesService;

    @Test
    void findByPage() {
        PageInfo<Courses> page = coursesService.findByPage(5,10);
        // System.out.println(page);
        assertEquals(10,page.getList().size());
    }


}