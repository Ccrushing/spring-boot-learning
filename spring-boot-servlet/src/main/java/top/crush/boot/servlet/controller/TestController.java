package top.crush.boot.servlet.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Crush
 * @date 2021/4/6
 * @dercsiption TestController
 */
@RestController
@Slf4j

public class TestController {

    @GetMapping("test")
    public String test(HttpServletRequest request, HttpSession session, @RequestParam(name = "name") String name) {
        log.info("进入接口调用");
        log.info("请求参数：" + name );
//        request.setAttribute("a","a");
//        request.getAttribute("a");
//        request.setAttribute("a","aaa");
//        request.removeAttribute("b");
//
//        session.setAttribute("b","b");
//        session.invalidate();
        return   "hello springboot";
    }

    @PostMapping("login")
    public String login(@RequestParam(name = "account") String account,@RequestParam(name = "password") String password) {
        if ("admin".equals(account) && "111".equals(password)) {
            return "login success";
        } else {
            return "login failure";
        }
    }

}
