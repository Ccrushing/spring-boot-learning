package crush.top.boot.aop.controller;

import crush.top.boot.aop.annotation.ControllerWebLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Crush
 * @date 2021/4/1
 * @dercsiption HelloController
 */
@RestController
@RequestMapping(value = "api")
@Slf4j
public class HelloController {

    @GetMapping("hello")
    @ControllerWebLog(name = "getHello", isSaved = true)
    public String getHello(String name,String title) {
        //休眠，模拟接口耗时
//        try {
//            Thread.sleep(6000);
//        } catch (InterruptedException)
        log.info("controller的name参数：" + name);
        log.info("controller的title参数：" + title);
//        int a = 3 / 0;
        return "hello spring boot aop!";
    }
}
