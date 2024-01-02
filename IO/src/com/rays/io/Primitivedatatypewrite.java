package com.rays.io;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Primitivedatatypewrite {
	
	public static void main(String[] args) throws IOException {
		DataOutputStream ds=new DataOutputStream(new FileOutputStream("D:\\mera.txt"));
		
		ds.write(1);
		ds.writeBoolean(true);
        ds.writeChar('a');
        ds.writeDouble(1.2);
        ds.close();
        System.out.println("success");
	
	}

}
