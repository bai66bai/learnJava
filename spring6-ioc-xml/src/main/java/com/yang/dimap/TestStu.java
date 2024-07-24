package com.yang.dimap;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStu {

    @Test
    public void testStu(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-diref.xml");
        Student student = context.getBean("student", Student.class);
        student.run();
    }
}
