package com.yhc.springbootweek04.controller;

import com.yhc.springbootweek04.common.Result;
import com.yhc.springbootweek04.entity.Team;
import com.yhc.springbootweek04.exception.BusinessException;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TeamController
 * @Description:
 * @Author: 你的名字
 * @Date: 2026/3/26 16:53
 * @Version: 1.0
 **/
@RestController
@RequestMapping("/api/team")
@Slf4j
public class TeamController {
    @PostMapping("/add")
    public Result<String> addTeam(@Validated @RequestBody Team team, HttpServletRequest request) {
        log.info("添加团队: {}", team);
        String token = request.getHeader("token");
        if (token == null || token.isBlank()) {
            throw new BusinessException(401, "请先登录");
        }
        if (!"admin".equals(token)){
            throw new BusinessException(403, "无权限");
        }
        int a = 1/0;
        return Result.success("添加成功");
    }
}
