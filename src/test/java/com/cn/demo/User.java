package com.cn.demo;

/**
 * @title:User
 * @Author zhangziqiang
 * @Date: 2022/5/1112:10
 * @Description
 * @Version 1.0
 */
public class User {

    private Integer id;
    private String code;

    public User(Integer id, String code) {
        this.id = id;
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public static Integer comparingByInnercodeA(User u) {
            return Integer.valueOf(u.getCode());
        }
}
