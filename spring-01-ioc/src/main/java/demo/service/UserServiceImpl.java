package demo.service;

import demo.dao.UserDao;
import demo.dao.UserDaoImpl;

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
