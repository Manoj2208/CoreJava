package com.manu.collection;

class SynchThread implements Runnable {

	  public void run() {
		  synchronized(this){
			  
		 
		for (int i = 1; i <= 10; i++) {
			try{
				Thread.sleep(500);
	
			}
			catch(Exception e){
				e.printStackTrace();
			}
			System.out.println(5 * i);
		}
	}

	}
	public static void main(String[] args) throws InterruptedException {
		Thread t=new Thread(new SynchThread());
		Thread t1=new Thread(new SynchThread());
		t.start();
		//t.join();
		t1.start();
	}

}