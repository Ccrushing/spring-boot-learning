package crush.top.boot.mbp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"crush.top.boot.mbp.mapper"})
public class SpringbootMbpApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootMbpApplication.class, args);
    }

}
