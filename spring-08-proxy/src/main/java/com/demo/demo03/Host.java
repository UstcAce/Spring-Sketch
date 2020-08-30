package com.demo.demo03;

import java.lang.reflect.InvocationHandler;

// 房东
public class Host implements Rent {

    public void rent() {
        System.out.println("房东要出租房子！");
    }
}
