package com.collection.cn;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author： lenovo
 * @date： 2022/1/7 11:02
 * @modifiedBy：
 * @description：
 * @version: 1.0
 */
public class ListTest {
    public static void main(String[] args) {

    }

    @Test
    public void subList_Test() {
        List<String> listName = new ArrayList<>();
        listName.add("a");
        listName.add("b");
        listName.add("c");
        listName.add("d");
        // subList 方法给的我们返回是一个视图,即是ArrayList的视图,subList知识ArrayList的内部类,它们之间并没有继承关系,故无法直接进行强制类型转换。
        List<String> strings = listName.subList(0, 1);
        System.out.println(strings);
    }

    @Test
    public void subList_Test2() {
        // 非结构性改变subList 当改变subList中的元素，原来的sourceList对应的元素也发生改变。
        List<String> sourceList = new ArrayList<>();
        sourceList.add("a");
        sourceList.add("b");
        sourceList.add("c");
        sourceList.add("d");

        List<String> subList = sourceList.subList(1, 3);
        System.out.println("sourceList：" + sourceList);
        System.out.println("sourceList.subList(1,3) 得到List：");
        System.out.println("subList：" + subList);

        subList.set(1, "777");
        System.out.println("subList.set(1,777) 得到List：");
        System.out.println("subList：" + subList);
        System.out.println("sourceList：" + sourceList);
    }


    @Test
    public void subList_Test3() {
        // 结构性改变subList 当添加subList中的元素，原来的sourceList对应的元素也发生添加。
        List<String> sourceList = new ArrayList<>();
        sourceList.add("a");
        sourceList.add("b");
        sourceList.add("c");
        sourceList.add("d");

        List<String> subList = sourceList.subList(1, 3);
        System.out.println("sourceList：" + sourceList);
        System.out.println("sourceList.subList(1,3) 得到List：");
        System.out.println("subList：" + subList);

        subList.add("777");
        System.out.println("subList.add(777) 得到List：");
        System.out.println("subList：" + subList);
        System.out.println("sourceList：" + sourceList);
    }

    @Test
    public void subList_Test4() {
        // 结构性改变sourceList 当添加sourceList中的元素，原来的subList出现异常。
        List<String> sourceList = new ArrayList<>();
        sourceList.add("a");
        sourceList.add("b");
        sourceList.add("c");
        sourceList.add("d");

        List<String> subList = sourceList.subList(1, 3);
        System.out.println("sourceList：" + sourceList);
        System.out.println("sourceList.subList(1,3) 得到List：");
        System.out.println("subList：" + subList);

        sourceList.add("777");
        System.out.println("subList.add(777) 得到List：");
        System.out.println("sourceList：" + sourceList);
        System.out.println("subList：" + subList);
    }

    @Test
    public void subList_Test5() {
        // 如何创建新的List  对subList作出修改，又不想动原list.那么可以创建subList的一个拷贝
        List<String> sourceList = new ArrayList<>();
        sourceList.add("a");
        sourceList.add("b");
        sourceList.add("c");
        sourceList.add("d");

        List<String> subList = sourceList.subList(1, 3);
        // TODO 创建subList的一个拷贝
        ArrayList<String> list = Lists.newArrayList(subList);

        list.add("e");
        List<String> collect = list.stream().filter(v -> null != v && "b".equals(v)).collect(Collectors.toList());
        System.out.println("sourceList：" + sourceList);
        System.out.println("sourceList.subList(1,3) 得到List：");
        System.out.println("list：" + list);
        System.out.println("collect：" + collect);
    }
}
