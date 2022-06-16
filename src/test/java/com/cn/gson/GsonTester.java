package com.cn.gson;


import com.cn.gson.model.Student;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;

/**
 * @title:GsonTester Gson 对象数据绑定
 * @Author zhangziqiang
 * @Date: 2022/5/822:16
 * @Description 我们创建了一个 Student 类。我们将创建一个 student.json 文件，该文件将具有 Student 对象的 json 表示。
 * @Version 1.0
 */

public class GsonTester {
    public static void main(String args[]) {
        GsonTester tester = new GsonTester();
        try {
            Student student = new Student();
            student.setAge(10);
            student.setName("Mahesh");
            tester.writeJSON(student);
            Student student1 = tester.readJSON();
            System.out.println(student1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeJSON(Student student) throws IOException {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        FileWriter writer = new FileWriter("student.json");
        writer.write(gson.toJson(student));
        writer.close();
    }

    private Student readJSON() throws FileNotFoundException {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader("student.json"));

        Student student = gson.fromJson(bufferedReader, Student.class);
        return student;
    }
}

