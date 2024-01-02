package com.rays.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class primitivewrite {
	public static void main(String[] args) throws IOException {
		
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("D:\\Neeraj.txt"));
		dos.write(2);
		dos.writeBoolean(true);
		dos.writeDouble(34.23);
		dos.writeChar('e');
		
		dos.close();
		System.out.println("done");
	}

}
