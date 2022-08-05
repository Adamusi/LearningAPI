package com.stream.cn;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author： lenovo
 * @date： 2022/1/29 11:16
 * @modifiedBy：
 * @description：
 * @version: 1.0
 */
public class StreamTest {

    @Test
    public void TestTrace() {
        Stream.of("beijing","tianjin","shanghai","wuhan")
                .map(String::length)
                .filter(e->e>5)
                .collect(Collectors.toList());
    }

    @Test
    public void test() {


        String [] str = {"1","2","3"};
        List<String> dtoList = new ArrayList<String>(Arrays.asList(str).size());
        System.out.println(dtoList);
    }

    @Test
    public void test2() {
        List<Map<String, Object>> bizList = new ArrayList<Map<String, Object>>();
        Map<String, Object> map  = new HashMap<>();
        Map<String, Object> map2  = new HashMap<>();
        map.put("parentorgid","123");
        map.put("Test","123");
        map2.put("parentorgid","1234");
        map2.put("Test","123");
        bizList.add(map);
        bizList.add(map2);
        List<String> vidList = bizList.stream().map(item -> String.valueOf(item.get("parentorgid"))).collect(Collectors.toList());
        System.out.println(vidList);
    }
}
