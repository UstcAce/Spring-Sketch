package com.demo.pojo;

public class User2 {
    private String name;

    public User2() {
        System.out.println("User2���޲������캯��");
    }

    public User2(String name) {
        this.name = name;
        System.out.println("User2���в������캯��");
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
