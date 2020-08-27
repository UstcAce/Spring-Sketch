package com.demo.pojo;

public class User2 {
    private String name;

    public User2() {
        System.out.println("User2的无参数构造函数");
    }

    public User2(String name) {
        this.name = name;
        System.out.println("User2的有参数构造函数");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name=" + name);
    }
}
