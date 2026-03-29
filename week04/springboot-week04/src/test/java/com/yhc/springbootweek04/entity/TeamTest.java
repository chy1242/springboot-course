package com.yhc.springbootweek04.entity;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @ClassName: TeamTest
 * @Description:
 * @Author: 你的名字
 * @Date: 2026/3/26 16:47
 * @Version: 1.0
 **/
@SpringBootTest
@Slf4j
class TeamTest {
    @Resource
    private Team team;

    @Test
    void testTeam(){
        log.info("team: {}",team);
        assertTrue(team.getLeader().length()>=2 && team.getLeader().length()<=5);
        assertTrue(team.getAge()>=18 && team.getAge()<=60);
        assertTrue(team.getEmail().matches("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$"));
        assertTrue(team.getPhone().matches("^\\d{11}$"));
        assertTrue(team.getCreateTime().isBefore(LocalDate.now()));
    }

}