package com.yhc.springboothello.vo;

import lombok.Data;

/**
 * 通用返回结果封装类
 */
@Data
public class ResultVO<T> {

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 数据载体
     */
    private T data;

    /**
     * 成功构造方法
     */
    public ResultVO(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 静态成功方法
     */
    public static <T> ResultVO<T> success(T data) {
        return new ResultVO<>(200, "success", data);
    }
    
    /**
     * 静态成功方法（自定义消息）
     */
    public static <T> ResultVO<T> success(String msg, T data) {
        return new ResultVO<>(200, msg, data);
    }
}