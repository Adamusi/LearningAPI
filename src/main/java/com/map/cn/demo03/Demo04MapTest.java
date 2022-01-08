package com.map.cn.demo03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author 张自强
 * @date 2021-1-16 21:21:13
 *   补充遍历字符串，获取每一个字符
        1.String类的方法toCharArray,把字符串转换为一个字符数组，遍历数组
        2.String类的方法length()+charAt(索引)
 */

public class Demo04MapTest {

	public static void main(String[] args) {

		String cal = "zhangsan";

		HashMap<Character, Integer> map = new HashMap<>();
        // 2.String类的方法length()+charAt(索引)
		for (int i = 0; i < cal.length(); i++) {
			char charAt = cal.charAt(i);
			if (map.containsKey(charAt)) {
				Integer value = map.get(charAt);
				value++;
				map.put(charAt, value);
			} else {
				map.put(charAt, 1);
			}
		}

		Set<Character> keySet = map.keySet();
		for (Character key : keySet) {
			Integer valuekey = map.get(key);
			System.out.println(valuekey);
		}

		Iterator<Character> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			Character next = iterator.next();
			System.out.println(next);
		}

		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			Character key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key+"="+value);
		

		}

	}

}
