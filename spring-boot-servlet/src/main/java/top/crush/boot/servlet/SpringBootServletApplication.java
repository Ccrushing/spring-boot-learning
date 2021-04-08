package top.crush.boot.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author Crush
 * @date 2021/4/6
 * @dercsiption 启动主类，加上@ServletComponentScan，让servlet组件生效
 */
@SpringBootApplication
@ServletComponentScan
public class SpringBootServletApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootServletApplication.class,args);
    }
}
