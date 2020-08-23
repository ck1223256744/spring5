package service;

import dao.UserDao;
import dao.UserDaoimpl;

public class UserServiceImpl implements Userservice{

    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void func1() {
        userDao.func1();
    }
}
