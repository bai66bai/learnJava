package com.yang.spring6.resource.service;

import com.yang.spring6.resource.dao.UserDao;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service("myUserService")
public class UserServiceImpl implements UserService {

//不指定名称根据属性名进行注入
    @Resource
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("service执行");
        userDao.add();
    }
}
