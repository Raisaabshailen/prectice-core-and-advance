package com.rays.io;

import java.io.DataInputStream;
import java.io.IOException;

public class Keybordinput {

	
	public static void main(String[] args) throws IOException {
		DataInputStream dis=new DataInputStream(System.in);
		
		System.out.println("enter the nAme=");
	String name=	dis.readLine();
		System.out.println(name);
	}
}
