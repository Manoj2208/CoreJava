package com.manu.collection;

import java.util.*;

public class ExampleSet {
	public static void main(String[] args) {
		//HashSet<String> set=new HashSet<>();
		//LinkedHashSet<String> set=new LinkedHashSet<>();
		//Set<String> set=new TreeSet<>();
		Deque<String> set=new ArrayDeque<String>();
		set.offer("manu");
		set.add("madhu");
		set.offer("manu");
		set.offerFirst("sai");
		//set.add("abhi");
		//set.add("bharat");
		Iterator<String> i=set.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
	}
}
