package com.manu.collection;

import java.util.*;

public class ExampleMap {
	public static void main(String[] args) {
		//HashMap<Integer,String> map=new HashMap<>();
		//Map<Integer,String> map=new LinkedHashMap<>();
		TreeMap<Integer,String> map=new TreeMap<>();
		map.put(1,"manu");
		map.put(3,"sai");
		map.put(2,"madhu");
		for(Map.Entry<Integer,String> m:map.entrySet()){
			System.out.println(m);
		}
	}
}
