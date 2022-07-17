package com.Enum;

/**
 * @author： lenovo
 * @date： 2021/12/8 13:52
 * @modifiedBy：
 * @description：
 * @version: 1.0
 */

import com.alibaba.fastjson.JSONObject;
import com.exception.CommonErrorCode;

/**枚举类型的应用场景
 *
 * 将英文的季节转换成中文季节
 */
class UseSeason {

    public static String getChineseSeason(Season season) {
        StringBuffer result = new StringBuffer();
        switch (season) {
            case SPRING:
                result.append("[中文： 春天，枚举变量：" + season.name() + ", 数据：" + season.getCode() + "]");
                break;
            case SUNMMER:
                result.append("[中文： 夏天，枚举变量：" + season.name() + ", 数据：" + season.getCode() + "]");
                break;
            case AUTUMN:
                result.append("[中文： 秋季，枚举变量：" + season.name() + ", 数据：" + season.getCode() + "]");
                break;
            case WINTER:
                result.append("[中文： 冬季，枚举变量：" + season.name() + ", 数据：" + season.getCode() + "]");
                break;
            default:
                result.append("地球没有季节" + season.name());
                break;
        }
        return result.toString();
    }

    public void doSomething(int index) {
        // 枚举遍历
        for (Season s : Season.values()) {
            if (s.getCode() == index) {
                System.out.println(JSONObject.toJSON( getChineseSeason(s)));

            }
        }
    }

    public static void main(String[] args) {
        UseSeason useSeason = new UseSeason();
        useSeason.doSomething(1);
        System.out.println(ChangeStateEnum.ADD);
        System.out.println(CommonErrorCode.E_100101);
    }
}