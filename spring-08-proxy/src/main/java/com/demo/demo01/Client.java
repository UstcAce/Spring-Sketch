package com.demo.demo01;

public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        host.rent();

        // ����,�н�������ⷿ�ӣ����Ǵ����ɫһ�����һЩ��������
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
