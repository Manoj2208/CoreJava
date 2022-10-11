package com.manu.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) {
		try{
			
		
		Car c=new Car(2208, "BMW", 2500000.64);
		FileOutputStream fos=new FileOutputStream("car.txt");
		ObjectOutputStream out=new ObjectOutputStream(fos);
		out.writeObject(c);
		fos.close();
		out.close();
		System.out.println("serialized");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		try{
			FileInputStream fis=new FileInputStream("car.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Car c=(Car) ois.readObject();
			System.out.println(c);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
