package com.compare.cn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
/**
 *
 * HashMap 的key 和 value 排序
 */

public class SortHashMap_Test {

	public static Map<String, Integer> sortHashMap(Map<String, Integer> map) {

		HashMap<String, Integer> sortMap = new LinkedHashMap<>();
		List<String> list = new ArrayList<>();
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			list.add(iterator.next());
		}

		Collections.sort(list);

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String key = it.next();
			sortMap.put(key, map.get(key));
		}
		return sortMap;
	}

	public static List<Entry<String, Integer>> list(Map<String, Integer> map) {

		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return (o1.getValue() - o2.getValue());
			}
		});
		return list;
	}

	public static void main(String[] args) {

		HashMap<String, Integer> map = new LinkedHashMap<>();
		map.put("A", 123);
		map.put("B", 567);
		map.put("C", 234);;
		System.out.println("排序前=====：" + map);

		Map<String, Integer> sortHashMap = sortHashMap(map);
		System.out.println("按key排序后_1=====：" + sortHashMap);

		List<Entry<String, Integer>> list = list(sortHashMap);
		System.out.println("排value值排序_2=======：" + list);

	}
}
