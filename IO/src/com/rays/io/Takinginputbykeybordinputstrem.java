package com.rays.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Takinginputbykeybordinputstrem {
	
	public static void main(String[] args) throws IOException {
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		
		System.out.println("enter the name:");
		
		String name=br.readLine();
		
		System.out.println("name:="+name);
		
	}

}
