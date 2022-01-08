package com.reflect;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 集合反射
 */
public class Reflect_Test {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Map<String, String> map = new HashMap<String, String>();
	    map.put("hollis", "hollischuang");

	    Class<?> mapType = map.getClass();
	    Method capacity = mapType.getDeclaredMethod("capacity");
	    capacity.setAccessible(true);
	    System.out.println("capacity : " + capacity.invoke(map));

	    Field size = mapType.getDeclaredField("size");
	    size.setAccessible(true);
	    System.out.println("size : " + size.get(map));
		List<String> list = new ArrayList<String>();

		List<String> synchronizedList = Collections.synchronizedList(list);
		synchronizedList.add("1");
		synchronizedList.add("2");
		synchronizedList.add("3");
		for (String string : synchronizedList) {
			System.out.println(string);
		}

		//synchronized (synchronizedList) {
		Iterator<String> iterator = synchronizedList.iterator();
			while(iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}


	}
//}