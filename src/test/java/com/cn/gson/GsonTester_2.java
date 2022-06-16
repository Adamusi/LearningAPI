package com.cn.gson;

/**
 * @title:GsonTester_2  Gson 树模型
 * @Author zhangziqiang
 * @Date: 2022/5/822:22
 * @Description 树模型准备 JSON 文档的内存树表示。它构建了一个 JsonObject 节点树。它是一种灵活的方法，类似于 XML 的 DOM 解析器。
 * @Version 1.0
 */

import com.google.gson.*;

public class GsonTester_2 {
    public static void main(String args[]) {
        String jsonString =
                "{\"name\":\"Mahesh Kumar\", \"age\":21,\"verified\":false,\"marks\": [100,90,85]}";
        JsonParser parser = new JsonParser();
        JsonElement rootNode = parser.parse(jsonString);

        if (rootNode.isJsonObject()) {
            JsonObject details = rootNode.getAsJsonObject();
            JsonElement nameNode = details.get("name");
            System.out.println("Name: " +nameNode.getAsString());

            JsonElement ageNode = details.get("age");
            System.out.println("Age: " + ageNode.getAsInt());

            JsonElement verifiedNode = details.get("verified");
            System.out.println("Verified: " + (verifiedNode.getAsBoolean() ? "Yes":"No"));
            JsonArray marks = details.getAsJsonArray("marks");

            for (int i = 0; i < marks.size(); i++) {
                JsonPrimitive value = marks.get(i).getAsJsonPrimitive();
                System.out.print(value.getAsInt() + " ");
            }
        }
    }
}