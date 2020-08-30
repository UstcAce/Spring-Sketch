package com.demo.demo02;

/**
 * 新增功能，可以使用代理来实现
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

    // 日志方法
    private void log(String msg) {
        System.out.println("使用了" + msg + "方法");
    }
}
