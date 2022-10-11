package com.manu.collection;

import java.util.ArrayList;

public class StudentDriver {
	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		Student s=new Student(1,"manoj","java");
		Student s1=new Student(2,"madhu","python");
		Student s2=new Student(3,"darshan","dbms");
		list.add(s);
		list.add(s1);
		list.add(s2);
		for(Student o:list){
			System.out.println(o.id+" "+o.name+" "+o.subject);
		}
		
		
	}

}
