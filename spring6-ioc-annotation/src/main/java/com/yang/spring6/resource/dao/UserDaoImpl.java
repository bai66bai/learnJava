package com.yang.spring6.resource.dao;

import org.springframework.stereotype.Repository;

@Repository("myUserDao")
public class UserDaoImpl implements UserDao {


    @Override
    public void add() {
        System.out.println("dao执行");
    }
}
