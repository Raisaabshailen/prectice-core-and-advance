package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class charbychar {
	
	public static void main(String[] args) throws IOException {
		FileReader f=new FileReader("C:\\Users\\shailendra rai\\Downloads\\IOZip (1)\\jo banana he\\Me.txt");
	
	int s=f.read();
	
	while(s!=-1) {
		System.out.println((char)s);
		s=f.read();
		
	}
	}

}
