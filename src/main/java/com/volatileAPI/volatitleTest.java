package com.volatileAPI;

/**
 *
 * @author zzq
 * @description volatitle不保证原子性的例子
 */
public class volatitleTest {

	public volatile int inc = 0;

	public void increase() {
		inc++;
	}

	public static void main(String[] args) {

		String string ="zhang";
		string.intern();
		System.out.println(	string.intern());
		long t1 = System.currentTimeMillis();
		StringBuilder s = new StringBuilder("zhang");
		for (int i = 0; i < 100000; i++) {

			s.append(String.valueOf(i));
		}
		long t2 = System.currentTimeMillis();
        System.out.println("cost:"+(t2-t1));
		final volatitleTest t = new volatitleTest();
		// 创建10个线程
		for (int i = 0; i < 10; i++) {
			new Thread() {
				public void run() {
					// 分别执行10次
					for (int j = 0; j < 10; j++) {
						t.increase();
					}
				}
			}.start();
		}
		while (Thread.activeCount() > 1) {
			Thread.yield();
			// 执行结果<100
			System.out.println(t.inc);
		}

	}
}

