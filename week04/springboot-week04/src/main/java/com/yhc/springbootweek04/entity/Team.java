package com.yhc.springbootweek04.entity;

import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @ClassName: Team
 * @Description:
 * @Author: 你的名字
 * @Date: 2026/3/26 16:30
 * @Version: 1.0
 **/
@Validated
@Data
@Component
@ConfigurationProperties(prefix = "team")
public class Team {
    @NotBlank(message = "名称不能为空")
    @Length(min = 2, max = 5, message = "名称长度必须在2-5之间")
    private String leader;

    @Max(value = 60, message = "年龄不能大于60")
    @Min(value = 18, message = "年龄不能小于18")
    private Integer age;

    @Email(message = "邮箱格式不正确")
    private String email;

    @Pattern(regexp = "^\\d{11}$", message = "手机号格式不正确")
    private String phone;

    @Past(message = "创建时间不能大于当前时间")
    private LocalDate createTime;
}
