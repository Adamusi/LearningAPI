package com.serlializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Code_03_externalizableTest {

	public static void main(String[] args) throws Exception {

		Code_03_externalizable per = new Code_03_externalizable();
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
	    per = (Code_03_externalizable) is.readObject();
	    is.close();

		System.out.println("\n序列化之后");
		System.out.println("username:" + per.getUsername());
		System.out.println("id:" + per.getId());
	}
}
