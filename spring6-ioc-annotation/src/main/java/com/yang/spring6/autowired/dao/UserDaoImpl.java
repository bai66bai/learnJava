package com.yang.spring6.autowired.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{


    @Override
    public void add() {
        System.out.println("dao执行");
    }
}