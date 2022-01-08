package com.serlializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class serializableTest {

	public static void main(String[] args) throws Exception {

		serializable per = new serializable();
		per.setUsername("zhansan");
		per.setId("1");

		System.out.println("\n序列化之前");
		System.out.println("username:" + per.getUsername());
		System.out.println("id:" + per.getId());

		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("c:/test.txt"));
		os.writeObject(per);
		os.flush();
		os.close();

		per.setUsername("wangsi");
		ObjectInputStream  is = new ObjectInputStream (new FileInputStream("c:/test.txt"));
	    per = (serializable) is.readObject();
	    is.close();

		System.out.println("\n序列化之后");
		System.out.println("username:" + per.getUsername());
		System.out.println("id:" + per.getId());
	}
}
