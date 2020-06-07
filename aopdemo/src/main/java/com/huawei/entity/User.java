package com.huawei.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Data
@Setter
@Getter
@Component
public class User {
    private String name;
    private String country;
    private int age;
}
