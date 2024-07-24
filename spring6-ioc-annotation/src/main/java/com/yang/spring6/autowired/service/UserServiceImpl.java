package com.yang.spring6.autowired.service;

import com.yang.spring6.autowired.dao.UserDao;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    //注入dao
//    @Autowired
//    private  UserDao userDao;

    //set方法注入
//    private UserDao userDao;
//    @Autowired
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    //在构造方法上注入
    private  UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("service执行");
        userDao.add();
    }
}
