package com.manu.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPq {
	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		queue.add("wed");
		queue.add("sun");
		queue.add("mon");
		queue.add("fri");
		/*
		 * //System.out.println(queue.poll());
		 * 
		 * //System.out.println("----------------------");
		 * //queue.forEach(System.out::println);
		 */		for(int i=0;i<queue.size();i++){
			System.out.println(queue.poll());
		}
	}
}
