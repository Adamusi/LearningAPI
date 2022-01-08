package com.stream.cn;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * ClassName: filterCode <br/>
 * Description: <br/>
 * date: 2021/11/21 22:00<br/>
 *
 * @author Administrator<br />
 * @since JDK 11
 */
public class FilterCodeTest {

    @Test
    public void test0() {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add(null);
        // 获取 集合中大于 "cax" 字符串
        // stream流 支持链式调用
        List<String> collect = list.stream().filter(s -> null != s && "cax".compareTo(s) < 0).
                collect(Collectors.toList());
        System.out.println(collect);
    }


    @Test
    public void test1() {
        List<Map<String, Object>> listAll = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("name","zhangsan");
        map.put("chinese",80);
        map.put("english",70);
        map.put("math",899);
        listAll.add(map);
        Map<String, Object> map1 = new HashMap<>();
        map1.put("name","wangwu");
        map1.put("chinese",80);
        map1.put("english",70);
        map1.put("math",84);
        listAll.add(map1);


        // map : 做数据映射的 特点： 原集合的长度 和映射后集合的长度一致，且每条记录和原记录有一定的关系
        List<Map<String, Object>> biz = listAll.stream().map(m -> {
            Map<String, Object> mapList = new HashMap<>();
            mapList.put("name", m.get("name"));
            //转成 Integer
            Integer chinese = Integer.parseInt(String.valueOf(m.get("chinese")));
            Integer english = Integer.parseInt(String.valueOf(m.get("english")));
            Integer math = Integer.parseInt(String.valueOf(m.get("math")));
            mapList.put("sum", chinese + english + math);
            return mapList;
            // peek 是一个中间过程，主要用于代码调试，出现在链的尾部是不会执行的。
        })//.peek(System.out::println)
                .collect(Collectors.toList());
        System.out.println("==============" +biz);
    }
}






