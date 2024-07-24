package com.yang.di.ditest;

import java.util.List;
import java.util.stream.Stream;

//部门类
public class Dept {

    //一个部门有很多员工
    private List<Emp> empList;
    private String dname;

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    public void info(){
        System.out.println("部门名称：" + dname);
        Stream<Emp> stream = empList.stream();
        stream.forEach(e -> System.out.println(e.getEname()));
    }
}
