package com.manu.collection;

//public class A extends Thread{
public class A implements Runnable {
	synchronized public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(5 * i);
		}
	}

	public static void main(String[] args) {
		Thread t = new Thread(new A(), "manu");
		Thread t1 = new Thread(new A(), "madhu");
		t.start();
		t1.start();
		// t.setPriority(MIN_PRIORITY);
		/*
		 * System.out.println(t.getPriority()); System.out.println(t.getName());
		 * System.out.println(t1.getPriority());
		 * System.out.println(t1.getName());
		 */
	}
}
