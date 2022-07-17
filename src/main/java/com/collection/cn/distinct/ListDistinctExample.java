package com.collection.cn.distinct;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author： lenovo
 * @date： 2022/3/23 10:07
 * @modifiedBy：
 * @description：
 * @version: 1.0
 */
public class ListDistinctExample {
    //Stream去重(有序)
    
    @Test
    public void test1() {
        List<Integer> list = new ArrayList<Integer>() {{
            add(1);
            add(3);
            add(5);
            add(2);
            add(1);
            add(3);
            add(7);
            add(2);
        }};
        System.out.println("原集合:" + list);
        method_5(list);
    }


    /**
     * 使用 Stream 去重  降序
     * @param list
     */
    public static void method_5(List<Integer> list) {
        list = list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("去重集合:" + list);

        TreeSet<Integer> set = new TreeSet<>(list);
        System.out.println("去重集合:" + set);

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>(list);
        System.out.println("去重集合:" + set2);

        HashSet<Integer> set3 = new HashSet<>(list);
        System.out.println("去重集合:" + set3);
    }


    //方法1：contains判断去重(有序)
    @Test
    public void test2(){
        List<Integer> list = new ArrayList<Integer>() {{
            add(1);
            add(3);
            add(5);
            add(2);
            add(1);
            add(3);
            add(7);
            add(2);
        }};
        System.out.println("原集合:" + list);
        method(list);
    }

    /**
     * 自定义去重
     * @param list
     */
    public static void method(List<Integer> list) {
        // 新集合
        List<Integer> newList = new ArrayList<>(list.size());
        list.forEach(i -> {
            if (!newList.contains(i)) { // 如果新集合中不存在则插入
                newList.add(i);
            }
        });
        System.out.println("去重集合:" + newList);
    }


    //方法2：迭代器去重(无序)
    @Test
    public void test3() {
        List<Integer> list = new ArrayList<Integer>() {{
            add(1);
            add(3);
            add(5);
            add(2);
            add(1);
            add(3);
            add(7);
            add(2);
        }};
        System.out.println("原集合:" + list);
        method_1(list);
    }

    /**
     * 使用迭代器去重
     * @param list
     */
    public static void method_1(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            // 获取循环的值
            Integer item = iterator.next();
            // 如果存在两个相同的值
            if (list.indexOf(item) != list.lastIndexOf(item)) {
                // 移除最后那个相同的值
                iterator.remove();
            }
        }
        System.out.println("去重集合:" + list);
    }
}         
  

