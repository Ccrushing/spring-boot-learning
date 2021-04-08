package top.crush.boot.servlet.config;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import top.crush.boot.servlet.interceptor.CustomInterceptor;

import javax.annotation.Resource;

/**
 * @author Crush
 * @date 2021/4/6
 * @dercsiption 自定义拦截器注册类
 * 用@ CustomInterceptor 注解标注本类为一个配置类，SpringBoot会自动配置
 */
public class MyWebMvcConfig implements WebMvcConfigurer {
    /**
     * 注入自定义拦截器
     */
    @Resource
    CustomInterceptor customInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册自定拦截器，排除路径
        registry.addInterceptor(customInterceptor).addPathPatterns("/**").excludePathPatterns("/login");

    }
}
