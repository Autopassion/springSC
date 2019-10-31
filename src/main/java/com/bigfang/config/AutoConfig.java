package com.bigfang.config;

import com.bigfang.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName AutoConfig
 * @Description TODO
 * @Author yaoyong.fang
 * @Date 2019/10/31 17:40
 * @Version 1.0
 **/
@Configuration
public class AutoConfig {
    
    @Bean
    public Person person(){
        return new Person("lisi", 19);
    }
}
