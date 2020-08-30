package com.demo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// 表明这个类被Spring接管了，注册到容器中
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("Ace")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
