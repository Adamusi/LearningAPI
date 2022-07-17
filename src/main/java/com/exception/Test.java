package com.exception;

/**
 * @title:Test
 * @Author zhangziqiang
 * @Date: 2022/7/1715:41
 * @Description
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) throws Exception {

        try {
            int a = 10/0;
            System.out.println("=========" + a);
        }catch (Exception e){
            throw new Exception(String.valueOf(CommonErrorCode.E_100101));
        }
    }
}
