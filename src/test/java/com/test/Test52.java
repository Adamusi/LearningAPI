package com.test;

import java.util.Arrays;

import org.junit.Test;

import com.so.MultiplyArray52;

/**
 * 第52题
 * 构建乘积数组
 *
 * @author qgl
 * @date 2019/04/08
 */
public class Test52 {

    @Test
    public void test52() throws Exception {
        int[] arr = {2, 3, 4, 5};
        System.out.println("乘积数组：" + Arrays.toString(MultiplyArray52.multiply(arr)));
    }
}
