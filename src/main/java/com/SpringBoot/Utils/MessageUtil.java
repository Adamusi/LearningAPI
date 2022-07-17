package com.SpringBoot.Utils;

import com.SpringBoot.Model.Result;

/**
 * @title:MessageUtil
 * @Author zhangziqiang
 * @Date: 2022/7/1715:49
 * @Description
 * @Version 1.0
 */
public class MessageUtil {

    /**
     * 成功方法
     * @param object
     * @return
     */
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMessage("SUCCESS");
        if (object != null) {
            result.setData(object);
        }
        return result;
    }
    /**
     * 成功但是
     */
    public static Result success() {
        return success(null);
    }
    /**
     * 失败方法
     * @param code
     * @param message
     * @return
     */
    public static Result error(Integer code, String message) {
        Result result = new Result();
        result.setCode(code);
        result.setMessage(message);
        return result;
    }
}
