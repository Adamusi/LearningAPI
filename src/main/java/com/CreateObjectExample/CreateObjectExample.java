package com.CreateObjectExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/**
 * @author zzq
 * @date 2021-3-16 20:52:03 JAVA创建对象的几种方式
 */

public class CreateObjectExample {

	
	public static void main(String[] args) {

		  /**
         * 1. 使用new创建对象
         */
        Book book1 = new Book();
        book1.setName("Redis");
        book1.setAuthors(Arrays.asList("Eric", "John"));
        book1.setPrice(59.00f);
        book1.setIsbn("ABBBB-QQ677868686-HSDKHFKHKH-2324234");
        System.out.println(book1);

        /**
         * 2. 使用clone创建对象
         */
        try {
            Book book2 = (Book) book1.clone();
            System.out.println(book2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


        /**
         * 3. 使用Class.newInstance();
         */
        try {
            Book book3 = (Book) Class.forName("Code_01_CreateObjectExample.Book").newInstance();
            System.out.println(book3);

            book3 = Book.class.newInstance();
            System.out.println(book3);
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
          
            e.printStackTrace();
        }

        /**
         * 4. 使用Constructor.newInstance();
         */
        try {
            //选择第一个构造器创建Book
            Book book4 = (Book) Book.class.getConstructors()[0].newInstance();
            //Book [name=null, authors=null, isbn=null, price=0.0]
            System.out.println(book4);

            /**
             * 调用指定构造函数创建对象
             */
            book4 = (Book) Book.class.getConstructor(String.class, List.class, String.class,
                    float.class).newInstance("New Instance Example", Arrays.asList("Wang", "Eric"),
                    "abc1111111-def-33333", 60.00f);
            //Book [name=New Instance Example, authors=[Wang, Eric], isbn=abc1111111-def-33333, price=60.0]
            System.out.println(book4);
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException
                | InvocationTargetException | SecurityException | NoSuchMethodException e) {
           
            e.printStackTrace();
        }

        /**
         * 5. 使用反序列化
         */
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.dat"));
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.dat"));) {
            oos.writeObject(book1);

            Book book5 = (Book) ois.readObject();
            System.out.println(book5);

        } catch (IOException | ClassNotFoundException e) {
          
            e.printStackTrace();
        }
    }
}
