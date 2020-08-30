package com.demo.config;

import com.demo.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 表明这个类也会被Spring接管了，注册到容器中，因为它本来就是一个Component
// @Configuration代码这是一个配置类，等于我们之前的beans.xml
@Configuration
@ComponentScan("com.demo.pojo")
public class UserConfig {
    /**
     * 注册一个bean，就相当于我们之前写的一个bean标签。这个方法的名字就相当于
     * bean标签中的id属性，这个方法的返回值就相当于bean标签中的class属性
     */
    @Bean
    public User user() {
        // 就是要返回注入到bean的对象
        return new User();
    }
}
