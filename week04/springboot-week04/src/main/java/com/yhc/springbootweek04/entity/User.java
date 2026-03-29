package com.yhc.springbootweek04.entity;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @ClassName: User
 * @Description:
 * @Author: 你的名字
 * @Date: 2026/3/26 15:26
 * @Version: 1.0
 **/
@Data
public class User {
    private Long id;
    private String name;
    private LocalDate createTime;
}
