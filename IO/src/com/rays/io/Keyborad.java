package com.rays.io;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Keyborad {

	public static void main(String[] args) throws IOException {
		DataInputStream dis=new DataInputStream(System.in);
		
		System.out.println("enter your name");
		String name=dis.readLine();
		
		System.out.println(name);
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter surname");
		
		String surname=sc.next();
		System.out.println(surname);
	}
}
