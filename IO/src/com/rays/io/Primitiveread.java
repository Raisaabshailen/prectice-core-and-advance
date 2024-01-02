package com.rays.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Primitiveread {
	
	public static void main(String[] args) throws IOException {
		DataInputStream dis=new DataInputStream(new FileInputStream("D:\\Neeraj.txt"));
		System.out.println(dis.read());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		System.out.println(dis.readDouble());
	}

}
