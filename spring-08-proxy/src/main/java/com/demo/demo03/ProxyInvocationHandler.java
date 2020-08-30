package com.demo.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    // ������Ľӿ�
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // ���ɵõ�������
    public Object getProxy() {
         return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        // ��̬����ı��ʣ�����ʹ�÷������ʵ�֣�
        Object result = method.invoke(rent, args);
        fare();
        return result;
    }

    public void seeHouse() {
        System.out.println("�м��������");
    }

    // ���н��
    public void fare() {
        System.out.println("���н��");
    }
}
