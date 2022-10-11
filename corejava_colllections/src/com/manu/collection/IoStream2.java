package com.manu.collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoStream2 {
	public static void main(String[] args) throws IOException {
		try {
			/*
			 * FileOutputStream fos = new FileOutputStream("f2.txt"); String s =
			 * "hi this is my first project"; byte b[] = s.getBytes();
			 * fos.write(b); fos.close();
			 */
			FileInputStream fis = new FileInputStream("f2.txt");
			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
			fis.close();

			System.out.println("fine");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
