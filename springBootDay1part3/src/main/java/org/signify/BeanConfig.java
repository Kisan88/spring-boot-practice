package org.signify;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "org.signify")
@EnableAspectJAutoProxy
public class BeanConfig {
    @Bean
    @Scope(value = "prototype")
    public User user(){
        return new User("Kisan gupta","kisan@gmail.cm","1234567890");
    }

}
