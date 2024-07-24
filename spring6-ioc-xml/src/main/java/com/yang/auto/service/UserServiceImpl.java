package com.yang.auto.service;

import com.yang.auto.dao.UserDao;

public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUserService() {
        System.out.println("userservice中的方法执行了");
        userDao.addUserDao();
    }
}
