package com.Enum;

/**
 * @author： lenovo
 * @date： 2021/12/8 13:51
 * @modifiedBy：
 * @description：
 * @version: 1.0
 */
/**
 Java 定义枚举类型的语句很简约
 特点：1.关键字enum 2.类型名称  3.一串允许的值 4.枚举可以单独定义
 5.枚举可以实现一个或多个接口 6.定义新的变量 7.定义新方法 8.根据具体枚举值而相异的类
 */
public enum Season  {
    SPRING(1),
    SUNMMER(2),
    AUTUMN(3),
    WINTER(4);

    private int code;

    private Season(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}