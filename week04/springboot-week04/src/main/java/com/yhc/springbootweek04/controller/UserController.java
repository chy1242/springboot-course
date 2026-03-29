package com.yhc.springbootweek04.controller;

import com.yhc.springbootweek04.common.Result;
import com.yhc.springbootweek04.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @ClassName: UserController
 * @Description:
 * @Author: 你的名字
 * @Date: 2026/3/26 15:28
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/api/user")
public class UserController {
    @GetMapping("/info")
    public Result<User> getUserInfo() {
        User user = new User();
        user.setId(1L);
        user.setName("张三");
        user.setCreateTime(LocalDate.now());
        return Result.success(user);
    }
}
