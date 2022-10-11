package com.manu.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoStreamsDema {
	public static void main(String[] args) throws IOException {
		try {
			/*
			 * FileOutputStream fos=new FileOutputStream("f1.txt");
			 * fos.write(65); fos.close();
			 */

			FileInputStream fis = new FileInputStream("f1.txt");
			int i = fis.read();
			System.out.println((char) i);
			System.out.println("successfully read");
			fis.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
