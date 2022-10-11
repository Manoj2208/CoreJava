package com.manu.collection;

import java.util.PriorityQueue;

public class PQdemo {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("mon");
		queue.add("tue");
		queue.add("wed");
		queue.add("thu");
		
		//System.out.println(queue.poll());
		
		/*
		 * for (String s : queue) { System.out.println(s);
		 * 
		 * }
		 */
		
		 for(int i=0;i<4;i++)
		 { System.out.println(queue.poll()); }
		
	}
}
