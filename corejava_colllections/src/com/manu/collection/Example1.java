package com.manu.collection;

import java.util.*;

public class Example1 {
public static void main(String[] args) {
	/**  ArrayList<String> name=new ArrayList<String>();
	name.add("manu");
	name.add("madhu");
	name.add("sairam");
	Iterator<String> itr=name.iterator();
	while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		**/
	Stack<String> name=new Stack<String>();
	name.push("manu");
	name.push("madhu");
	System.out.println(name.peek());
	int l=name.size();
	System.out.println(l);
	
		
	}
	
}


