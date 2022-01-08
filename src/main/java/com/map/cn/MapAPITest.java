package com.map.cn;

import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.*;

/**
 * ClassName: MapAPITest <br/>
 * Description: <br/>
 * date: 2021/12/7 9:15<br/>
 *
 * @author Administrator<br />
 * @since JDK 11
 */
public class MapAPITest {

    /**
     * @author 张自强
     * @date 2021-1-16 17:35:13
     * java.util.Map<k,v>集合
     * Map集合的特点:
     * 1.Map集合是一个双列集合,一个元素包含两个值(一个key,一个value)
     * 2.Map集合中的元素,key和value的数据类型可以相同,也可以不同
     * 3.Map集合中的元素,key是不允许重复的,value是可以重复的
     * 4.Map集合中的元素,key和value是一一对应
     * java.util.HashMap<k,v>集合 implements Map<k,v>接口
     * HashMap集合的特点:
     * 1.HashMap集合底层是哈希表:查询的速度特别的快
     * JDK1.8之前:数组+单向链表
     * JDK1.8之后:数组+单向链表|红黑树(链表的长度超过8):提高查询的速度
     * 2.hashMap集合是一个无序的集合,存储元素和取出元素的顺序有可能不一致
     * java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
     * LinkedHashMap的特点:
     * 1.LinkedHashMap集合底层是哈希表+链表(保证迭代的顺序)
     * 2.LinkedHashMap集合是一个有序的集合,存储元素和取出元素的顺序是一致的
     */
    @Test
    public void test0() {
        /*
    public V put(K key, V value):  把指定的键与指定的值添加到Map集合中。
        返回值:v
            存储键值对的时候,key不重复,返回值V是null
            存储键值对的时候,key重复,会使用新的value替换map中重复的value,返回被替换的value值
     */
        //创建Map集合对象,多态
        Map<String, String> map = new HashMap<>();
        String v1 = map.put("李晨", "范冰冰1");
        System.out.println("v1:" + v1);//v1:null

        String v2 = map.put("李晨", "范冰冰2");
        System.out.println("v2:" + v2);//v2:范冰冰1

        System.out.println(map);//{李晨=范冰冰2}


        map.put("冷锋", "龙小云");
        map.put("杨过", "小龙女");
        map.put("尹志平", "小龙女");
        System.out.println(map);//{杨过=小龙女, 尹志平=小龙女, 李晨=范冰冰2, 冷锋=龙小云}
    }


    /**
     * @author 张自强
     * @date 2021-1-16 20:43:58
     * <p>
     * Map集合遍历的第二种方式:使用Entry对象遍历
     * <p>
     * Map集合中的方法:
     * Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系的 Set 视图。
     * <p>
     * 实现步骤:
     * 1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来,存储到一个Set集合中
     * 2.遍历Set集合,获取每一个Entry对象
     * 3.使用Entry对象中的方法getKey()和getValue()获取键与值
     */
    @Test
    public void test1() {
        //创建Map集合对象
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "zhangsan");
        map.put(2, "lisi");
        map.put(3, "wangwu");
        //1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来,存储到一个Set集合中
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        //2.遍历Set集合,获取每一个Entry对象

        for (Map.Entry<Integer, String> entry : entrySet) {
            //3.使用Entry对象中的方法getKey()和getValue()获取键与值
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "==" + value);
        }
    }


    /**
     * @author 张自强
     * @date 2021-1-16 19:07:10
     * Map集合的第一种遍历方式:通过键找值的方式
     * Map集合中的方法:
     * Set<K> keySet() 返回此映射中包含的键的 Set 视图。
     * 实现步骤:
     * 1.使用Map集合中的方法keySet(),把Map集合所有的key取出来,存储到一个Set集合中
     * 2.遍历set集合,获取Map集合中的每一个key
     * 3.通过Map集合中的方法get(key),通过key找到value
     */
    @Test
    public void test2() {
        Map<Integer, String> map = new HashMap<>();


        map.put(1, "zhangsan");
        map.put(2, "lisi");
        map.put(3, "wangwu");
        //获取所有的key
        Set<Integer> keySet = map.keySet();
        //使用增强for循环遍历
        for (Integer key : keySet) {
            String value = map.get(key);
            System.out.println("value=" + value);
        }
        //使用迭代器遍历
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Integer it = iterator.next();
            String value2 = map.get(it);
            System.out.println("value2=" + value2);

        }


        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);


        items.forEach((k, v) -> {
            //items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
        });

        Map<String, Integer> items2 = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);


        for (Map.Entry<String, Integer> stringIntegerEntry : items2.entrySet()) {
            System.out.println("key:" + stringIntegerEntry.getKey() + ";value:" + stringIntegerEntry.getValue());
        }


        Map<String, String> map3 = new HashMap<String, String>();

        map3.put("A", "A");

        map3.put("B", "B");

        map3.put("C", "C");

        map3.put("D", "D");

        map3.put("E", "A");


        List<String> valuesList = new ArrayList<String>(map3.values());

        for (String str : valuesList) {

            System.out.println(str);

        }

    }


    @Test
    public void listToMap() {
        //Map<Integer, Animal> map = list.stream()
        //.collect(Collectors.toMap(Animal::getId, Function.identity()));
        //可以直接通过Maps 类创建一个HashMap：
        Map<String, String> map = Maps.newHashMapWithExpectedSize(7);
    }

}


