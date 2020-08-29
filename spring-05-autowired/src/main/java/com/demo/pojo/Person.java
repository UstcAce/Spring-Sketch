package com.demo.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class Person {
    // 如果现实定义了Autowired的required属性为false，说明这个对象可以为null，否则不允许为null。
    @Autowired(required = false)
    @Qualifier(value = "cat2")
//    @Resource(name="cat2") // 默认byName找不到则通过byType
    private Cat cat;

    @Autowired // 默认byName
    @Qualifier(value = "dog2")
    private Dog dog;

    private String name;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
