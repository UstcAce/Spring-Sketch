package com.demo.demo01;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        host.rent();

        // 代理,中介带房东租房子，但是代理角色一般会有一些附属操作
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
