package com.manu.collection;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		stack.push("manoj");
		stack.push("kumar");
		stack.push("madhu");
		System.out.println(stack);
		System.out.println(stack.peek());
		for(String s:stack){
			System.out.println(s);
		}
	}

}
