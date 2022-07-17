package com.SpringBoot.Model;

/**
 * @title:Result
 * @Author zhangziqiang
 * @Date: 2022/7/1715:47
 * @Description
 * @Version 1.0
 */
public class Result<T> {
    private Integer code; // 状态码
    private String message; // 状态描述信息
    private T data; // 定义为范型
    // 以下 getter、setter方法省略

    public Result() {}

    public Result(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}