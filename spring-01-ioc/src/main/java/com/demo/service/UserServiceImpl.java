package com.demo.service;

import com.demo.dao.UserDao;
import com.demo.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

//    private UserDao userDao;


    // ����Set���ж�ֵ̬��ע�룡
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
