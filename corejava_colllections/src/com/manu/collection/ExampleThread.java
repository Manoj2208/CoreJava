package com.manu.collection;

public class ExampleThread implements Runnable {

	@Override
	public void run() {
		
		print(5);
	}
	synchronized void print(int n){
	for(int i=0;i<=5;i++){
		System.out.println(n*i);
	}
	}
	public static void main(String[] args) throws InterruptedException {
		Thread t=new Thread(new ExampleThread());
		Thread t1=new Thread(new ExampleThread());
		
		t.start();
		t.join();
		t1.start();
	}

	
}
