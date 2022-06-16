package com.cn;

import com.alibaba.fastjson.JSON;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @title:test
 * @Author zhangziqiang
 * @Date: 2022/5/3119:56
 * @Description
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) throws Exception {

//        String date = null;
//        String rexp1 = "((\\d{2}(([02468][048])|([13579][26]))[\\-]((((0?[13578])|(1[02]))" +
//                "[\\-]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-]((0?[1-9])|([1-2][0-9])|(30)))|" +
//                "(0?2[\\-]((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-]" +
//                "((((0?[13578])|(1[02]))[\\-]((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-]" +
//                "((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-]((0?[1-9])|(1[0-9])|(2[0-8]))))))";
//
//        if(StringUtils.isNotBlank(date)  &&  date.matches(rexp1)) {
//
//            System.out.println("================");
//
//
//        }else if(StringUtils.isNotBlank(date) &&  date.matches(rexp1)){
//            System.out.println("================");
//        }
//        System.out.println("================");

        String date2 = "2022-06-03";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse(date2);
        if (parse.compareTo(new Date()) == 0) {
            System.out.println("===============");
        }

        System.out.println("zzz");


        int[] arr = {1, 2, 3, 4, 5};

        int[] arr2 = {0,0,0,0,0,5, 6, 7, 8, 9};

        System.arraycopy(arr, 0, arr2, 0, 5);

        System.out.println(JSON.toJSON(arr2));

    }






}
