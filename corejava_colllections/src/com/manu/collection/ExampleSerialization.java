package com.manu.collection;
import java.io.*;

public class ExampleSerialization  {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*try{
			
		
		Employee e=new Employee(2,"manu");
		FileOutputStream fout=new FileOutputStream("res.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(e);
		System.out.println("done");
		out.flush();
		out.close();
		}
		catch(Exception w){
			System.out.println(w);
		}*/
		
		try{
			
			
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("res.txt"));
			Employee s1=(Employee) in.readObject();
			System.out.println(s1.eid+" "+s1.ename);
			in.close();
			}
			catch(ClassNotFoundException W){
				System.out.println(W);
			}
				
	}

}
