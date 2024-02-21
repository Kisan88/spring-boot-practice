package org.signify;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "org.signify")
public class BeanConfig {
    @Bean
    @Scope(value = "prototype")
    public User user(){
        return new User("john", "john@gmail.com", new Phone("91","1234567890"));
    }
}
