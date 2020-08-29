package com.demo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// �ȼ��� <bean id="user" class="com.demo.pojo.User">
@Component
@Scope("singleton")
public class User {
    /* �����
    <bean id="user" class="com.demo.pojo.User">
        <property name="name" value="Ace"/>
    </bean>
     */
    @Value("Ace")
    public String name;
}
