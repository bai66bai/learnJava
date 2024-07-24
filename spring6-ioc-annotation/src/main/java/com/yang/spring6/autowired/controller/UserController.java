package com.yang.spring6.autowired.controller;

import com.yang.spring6.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    //注入service
    //1.属性注入
//    @Autowired //根据类型找到对应对象，完成注入
//    private UserService userService;

    //set方法注入
//    private UserService userService;
//
//    @Autowired
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

    //在构造方法上注入
    private UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void add(){
        System.out.println("controller......");
        userService.add();
    }
}
