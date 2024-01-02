package com.rays.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Primitivedataread {
	
	public static void main(String[] args) throws IOException {
		DataInputStream ds=new DataInputStream(new FileInputStream("D:\\mera.txt"));
		
		System.out.println(ds.read());
		System.out.println(ds.readBoolean());
		System.out.println(ds.readChar());
		System.out.println(ds.readDouble());
	}

}
