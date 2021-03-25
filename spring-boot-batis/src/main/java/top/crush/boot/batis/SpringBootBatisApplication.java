package top.crush.boot.batis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("top.crush.boot.batis.mapper")
public class SpringBootBatisApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootBatisApplication.class, args);
    }

}
