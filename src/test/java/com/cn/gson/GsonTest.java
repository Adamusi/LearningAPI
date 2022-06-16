package com.cn.gson;


import com.cn.gson.model.Student;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @title:GsonTest Gson 对象序列化
 * @Author zhangziqiang
 * @Date: 2022/5/819:43
 * @Description 创建一个包含学生详细信息的JSON字符串，并将其反序列化为 student 对象，然后将其序列化为JSON字符串
 * @Version 1.0
 */
public class GsonTest {
    public static void main(String[] args){
        String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";
        // 第1步：使用 GsonBuilder 创建 Gson 对象
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        // 第2步：将JSON反序列化为 Object
        Student student = gson.fromJson(jsonString, Student.class);
        System.out.println(student);
        // 第3步：将对象序列化为 JSON
        jsonString = gson.toJson(student);
        System.out.println(jsonString);
    }
}
