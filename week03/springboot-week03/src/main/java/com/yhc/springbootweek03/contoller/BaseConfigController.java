package com.yhc.springbootweek03.contoller;

import com.yhc.springbootweek03.config.AppConfig;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @Author: yhc
 * @Date: 2020-03-05 10:01
 * @Description: 配置类使用@Value注解获取配置文件属性
 */

@RestController
@RequestMapping("/config")
public class BaseConfigController {
    //    @Value("${server.port}")
//    private Integer port;
//    @Value("#{${app}}")
//    private Map<String, String> app;
    @Autowired
    private Environment env;
    @Resource
    private AppConfig appConfig;

    @GetMapping("/getApp")
    public String getApp() {
        return "当前服务器端口号:" + env.getProperty("server.port")
                + "当前应用名称:" + "项目名 " + env.getProperty("app.name")
                + "项目描述:" + env.getProperty("app.description")
                + "项目版本:" + env.getProperty("app.version");
    }

    @GetMapping("/getInfo")
    public Map<String, Object> getInfo() {
        return Map.of("appName", appConfig.getAppName(),
                "appDescription", appConfig.getAppDescription(),
                "appVersion", appConfig.getAppVersion());
    }

}
