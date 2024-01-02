package com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Imageexample {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("D:\\vayu.jpg");
		FileOutputStream fos= new FileOutputStream("D:\\IMG_5433.jpg");
		
		int i=fis.read();
		
		while(i!=-1) {
			fos.write(i);
			
			i=fis.read();
			
			
		}fis.close();
		fos.close();
		System.out.println("success");
		
	}

}
