package com.collection.cn.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author： lenovo
 * @date： 2022/3/23 10:31
 * @modifiedBy：
 * @description： 数组转集合
 * @version: 1.0
 */
public class arrayToList {

    @Test
    public void  test1() {
        // 不能对List增删，只能查改
        String[] strArray = new String[2];
        List list = Arrays.asList(strArray);
        //对转换后的list插入一条数据
        list.set(1,"zhang");
        System.out.println(list);
    }

    @Test
    public void  test2() {
        //支持增删改查的方式,在List的数据量不大
        String[] strArray = new String[2];
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(strArray)) ;
        list.add("1");
        System.out.println(list);
    }

    @Test
    public void  test3() {
        //Collections.addAll()方法(最高效)
        String[] strArray = new String[2];
        ArrayList< String> arrayList = new ArrayList<String>(strArray.length);
        Collections.addAll(arrayList, strArray);
        arrayList.add("1");
        System.out.println(arrayList);
    }

    @Test
    public void  test4() {
        //Collections.addAll()方法(最高效)
        int[] intArray1 = new int[1];
        Arrays.asList(intArray1);//编译不报错
        //List<Integer> list1 = Arrays.asList(intArray1);//编译报错
       // System.out.println(list1);
    }
}
