package com.yhc.springbootweek04.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName: Student
 * @Description:
 * @Author: 你的名字
 * @Date: 2026/3/26 14:56
 * @Version: 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private int age;
    private String sex;
    private String address;

}
