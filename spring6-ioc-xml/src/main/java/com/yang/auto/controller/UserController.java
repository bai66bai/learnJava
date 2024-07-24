package com.yang.auto.controller;

import com.yang.auto.service.UserService;

public class UserController {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser(){
        System.out.println("controller中的方法执行了。。。");
        //调用service中的方法
        userService.addUserService();
    }
}
