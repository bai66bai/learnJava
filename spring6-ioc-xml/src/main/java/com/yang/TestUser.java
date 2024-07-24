package com.yang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    public static void main(String[] args) {
//注意：当根据类型获取bean时，要求IOC容器中指定类型的bean有且只能有一个  多个会报错
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //根据id获取bean
        User user = (User)context.getBean("user");
        System.out.println("根据id获取bean：" + user);

        //根据类型获取bean
        User user1 = context.getBean(User.class);
        System.out.println("根据类型获取bean：" + user1);

        //根据id和类型获取bean
        User user2 = context.getBean("user", User.class);
        System.out.println("根据id和类型获取bean:" + user2);

    }
}
