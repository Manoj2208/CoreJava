package com.manu.collection;

import java.util.Map;
import java.util.TreeMap;

public class DemoMap {
	public static void main(String[] args) {
		Map<Integer,String> map=new TreeMap<>();
		map.put(22,"sun");
		map.put(2, "mon");
		map.put(13, "tue");
		map.put(4, "wed");
		
		System.out.println(map.size());
		
		for(Map.Entry<Integer, String> m:map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println();
		
		System.out.println(map);
		
		
	}

}
