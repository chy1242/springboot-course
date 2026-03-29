package com.yhc.springbootweek04;

import com.yhc.springbootweek04.entity.Student;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @ClassName: TestTest
 * @Description:
 * @Author: 你的名字
 * @Date: 2026/3/26 15:06
 * @Version: 1.0
 **/
class TestTest {
    @Resource
    private Student student;
    @Test
    void test1() {
        System.out.println(student);
    }
}