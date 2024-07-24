package com.yang.spring6.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component(value = "user")
public class User {
    private String name;
    private Integer age;
}
