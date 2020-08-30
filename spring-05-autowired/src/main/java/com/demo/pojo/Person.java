package com.demo.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class Person {
    // �����ʵ������Autowired��required����Ϊfalse��˵������������Ϊnull����������Ϊnull��
    @Autowired(required = false)
    @Qualifier(value = "cat2")
//    @Resource(name="cat2") // Ĭ��byName�Ҳ�����ͨ��byType
    private Cat cat;

    @Autowired // Ĭ��byName
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