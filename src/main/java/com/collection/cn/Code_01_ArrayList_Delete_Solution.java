package com.collection.cn;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

/**
 * 遍历的同时删除ArrayList元素(四种方式)
 */
public class Code_01_ArrayList_Delete_Solution {


    @Test
    public void test0() {

        List<String> list = new ArrayList<String>();
        list.add("zhang22");
        list.add("lisi11");
        list.add("zh11");
        list.add("zh11");
        list.add("zh11");

        //第一种：CopyOnWriteArrayList 安全线程
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>(list);
        copyOnWriteArrayList.add("11z");
        for (String s : copyOnWriteArrayList) {
            if ("zh11".equals(s)) {
                copyOnWriteArrayList.remove(s);
            }
        }
        System.out.println(copyOnWriteArrayList);
    }

    @Test
    public void test1() {

        List<String> list = new ArrayList<String>();
        list.add("zhang22");
        list.add("lisi11");
        list.add("zh11");
        list.add("zh11");
        list.add("zh11");

        // 第二种：iterator迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("zh11")) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    @Test
    public void test2() {
        List<String> list = new ArrayList<String>();
        list.add("zhang22");
        list.add("lisi11");
        list.add("zh11");
        list.add("zh11");
        list.add("zh11");

        // 第三种：Collection中的removeIf方法
        //list.removeIf(t-> "zh11".equals(t));
        // 第三种：JAVA8 Stream流中filter
        list = list.stream().filter(s -> !s.equals("zh11")).collect(Collectors.toList());
        System.out.println(list);
    }

    @Test
    public void test3() {
        List<String> list = new ArrayList<String>();
        list.add("zhang22");
        list.add("lisi11");
        list.add("zh11");
        list.add("zh11");
        list.add("zh11");

        // 第四种：增强for循环 == 删除第一个zh11
        for (String string : list) {
            if (string.equals("zh11")) {
                list.remove(string);
                break;
            }
        }
        System.out.println(list);
    }


    @Test
    public void test4() {
        List<String> list = new ArrayList<String>();
        list.add("lisi11");
        list.add("zh11");
        list.add("zh11");
        list.add("zh11");
        // 第五种：直接使用fail-safe的集合类 原理：对集合拷贝进行遍历
        ConcurrentLinkedDeque<String> cLinkedDeque = new ConcurrentLinkedDeque<>(list);
        cLinkedDeque.add("zhan");
        cLinkedDeque.add("zha");
        cLinkedDeque.add("zh");
        for (String string : cLinkedDeque) {
            if (string.equals("zh11")) {
                cLinkedDeque.remove();
            }
        }
        System.out.println(cLinkedDeque);
    }

    @Test
    public void test5() {
        //synchronizedList 进行遍历的时候需要手动加锁
        List<String> list2 = Collections.synchronizedList(new ArrayList<String>());

        list2.add("1");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        synchronized (list2) {
            Iterator<String> iterator = list2.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }

    @Test
    public void test6() {

        	List<String> list = new CopyOnWriteArrayList<String>();
        	list.add("1");
        	list.add("2");
        	list.add("3");
        	list.add("4");

        	Iterator<String> iterator = list.iterator();

        	for (String s : list) {
        		if (s.equals("1")) {
        			list.remove(s);
        		}
        	}
         	//System.out.println(list);
            // 缺点：迭代器不能访问修改后的内容
        	while (iterator.hasNext()) {
        		System.out.println(iterator.next());
        	}
        }
    }
