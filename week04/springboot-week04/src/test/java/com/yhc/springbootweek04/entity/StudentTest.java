package com.yhc.springbootweek04.entity;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @ClassName: StudentTest
 * @Description:
 * @Author: 你的名字
 * @Date: 2026/3/26 15:08
 * @Version: 1.0
 **/
@SpringBootTest
class StudentTest {
    @Resource
    private Student student;
    @Test
    public void test() {
        System.out.println(student);
    }
}