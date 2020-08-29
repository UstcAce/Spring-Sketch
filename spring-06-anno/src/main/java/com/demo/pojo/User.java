package com.demo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 等价于 <bean id="user" class="com.demo.pojo.User">
@Component
@Scope("singleton")
public class User {
    /* 相等于
    <bean id="user" class="com.demo.pojo.User">
        <property name="name" value="Ace"/>
    </bean>
     */
    @Value("Ace")
    public String name;
}
