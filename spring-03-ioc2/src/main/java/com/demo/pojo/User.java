package com.demo.pojo;

public class User {
    private String name;

    public User() {
        System.out.println("User���޲������캯��");
    }

    public User(String name) {
        this.name = name;
        System.out.println("User���в������캯��");
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
