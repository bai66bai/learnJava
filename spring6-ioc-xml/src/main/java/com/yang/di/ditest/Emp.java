package com.yang.di.ditest;

import java.util.Arrays;
import java.util.stream.Stream;

//员工类
public class Emp {
    //员工属于某个部门
    private Dept dept;
    private String ename;
    private Integer age;

    //爱好
    private String[] loves;

    public String[] getLoves() {
        return loves;
    }

    public void setLoves(String[] loves) {
        this.loves = loves;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void work(){
        System.out.println(ename + "emp working...." + age);
        dept.info();
        Stream<String> stream = Arrays.stream(loves);
        stream.forEach(e -> System.out.println(e));
    }
}
