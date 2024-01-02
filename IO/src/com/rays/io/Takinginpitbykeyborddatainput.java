package com.rays.io;

import java.io.DataInputStream;
import java.io.IOException;

public class Takinginpitbykeyborddatainput {

	
	public static void main(String[] args) throws IOException {
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter the name=");
		
		String name=dis.readLine();
		
		System.out.println("name=:"+ name);
	}
}
