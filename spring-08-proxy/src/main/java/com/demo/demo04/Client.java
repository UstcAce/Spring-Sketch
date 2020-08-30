package com.demo.demo04;

import com.demo.demo02.UserService;
import com.demo.demo02.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        // ��ʵ��ɫ
        UserServiceImpl userService = new UserServiceImpl();

        // �����ɫ��������
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // ���ô������
        pih.setTarget(userService);
        // ��̬���ɴ�����
        UserService proxy = (UserService) pih.getProxy();

        proxy.query();
    }
}
