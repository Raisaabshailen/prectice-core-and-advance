package com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStudentserial {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("D://Neeraj.txt"));
		StudentSerial s=new StudentSerial("shailendra", 88);
		
		out.writeObject(s);
		out.close();
		
		
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("D://Neeraj.txt"));
		
		s=(StudentSerial) in.readObject();
		System.out.println(s.getName());
		in.close();
	}

}
