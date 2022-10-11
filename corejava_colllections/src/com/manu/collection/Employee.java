package com.manu.collection;

import java.io.Serializable;

class Employee implements Serializable{
	int eid;
	String ename;
	Employee(int eid,String ename){
		this.eid=eid;
		this.ename=ename;
	}

}
