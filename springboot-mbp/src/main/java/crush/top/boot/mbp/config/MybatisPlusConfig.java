package crush.top.boot.mbp.config;

/**
 * @author Crush
 * @date 2021/4/1
 * @dercsiption MybatisPlusConfig
 */

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.autoconfigure.ConfigurationCustomizer;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages= {"crush.top.**.mapper"})
public class MybatisPlusConfig {
@Bean
public MybatisPlusInterceptor mybatisPlusInterceptor()
        {
        MybatisPlusInterceptor interceptor=new
                MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new
                PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
        }
@Bean
public ConfigurationCustomizer
        configurationCustomizer() {
        return configuration->
        configuration.setUseDeprecatedExecutor(false);
        }
        }
