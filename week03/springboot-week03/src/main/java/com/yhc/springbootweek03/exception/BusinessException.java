package com.yhc.springbootweek03.exception;

import lombok.Getter;

/**
 * @Author: yhc
 * @Date: 2020-03-05 10:02
 * @Description: 自定义业务异常类
 */
public class BusinessException extends RuntimeException{
    @Getter
    private Integer code;

    private final String message;

    /**
     * 构造方法
     * @param message
     */
    public BusinessException(String message) {
        super(message);
        this.message = message;
    }

    public BusinessException(String message, Integer code) {
        this.message = message;
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
