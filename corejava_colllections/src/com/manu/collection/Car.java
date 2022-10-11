package com.manu.collection;

import java.io.Serializable;

public class Car implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Car [cno=" + cno + ", brand=" + brand + ", price=" + price + "]";
	}

	int cno;
	String brand;
	double price;
	
	Car(int c,String s,double d){
		this.cno=c;
		this.brand=s;
		this.price=d;
	}

}
