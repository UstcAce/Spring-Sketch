package com.demo.demo02;

/**
 * �������ܣ�����ʹ�ô�����ʵ��
 */
public class UserServiceProxy implements UserService {
   private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    // ��־����
    private void log(String msg) {
        System.out.println("ʹ����" + msg + "����");
    }
}
