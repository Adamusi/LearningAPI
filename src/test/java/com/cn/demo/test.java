package com.cn.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Maps;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @title:test
 * @Author zhangziqiang
 * @Date: 2022/5/9 18:55
 * @Description
 * @Version 1.0
 */
public class test {
    public static void main(String[] args){


          Map<String, List<String>> map = Maps.newHashMapWithExpectedSize(7);
          String test = "1";
          List<String> str2 =  Arrays.asList(test);
          List<String> str = Arrays.asList("1", "2", "3");

           map.put("1", str2);
           map.put("2", str);
        //把默认容量设置成expectedSize / 0.75F + 1.0F 是一个在性能上相对好的选择，但是，同时也会牺牲些内存。
        //这个算法在guava中有实现，开发的时候，可以直接通过Maps类创建一个HashMap：

           System.out.println(map.get("1").get(0));
           System.out.println(map.get("2"));

        List<User> codeSort = new ArrayList<>();
        User user = new User(1,"13");
        User user1 = new User(2,"1201");
        User user2 = new User(3,"1200");
        User user3 = new User(4,"1209" );
        codeSort.add(user);
        codeSort.add(user1);
        codeSort.add(user2);
        codeSort.add(user3);
        List<User> collect = codeSort.stream().distinct().sorted(Comparator.comparing(User::getCode).reversed()).collect(Collectors.toList());
        System.out.println(collect.get(0).getCode());
        String innercode = "1234|56789|12345|6789";
        List<String> path = Arrays.asList(innercode.split("\\|"));
        List<String> innercodeList = new ArrayList<>(Arrays.asList(innercode.substring(0, 12),innercode.substring(0, 16)));
        System.out.println(innercodeList);
        List<String> innercodeList2 = new ArrayList<>(path);
        System.out.println(innercodeList2);

        System.out.println("deptList:"+ JSONObject.toJSONString(user));
    }

}
