package com.rays.io;

import java.io.File;

public class Filedirectroy2 {
	
	
	public static void main(String[] args) {
		File f=new File("C:\\Users\\shailendra rai\\Downloads\\IOZip\\jo banana HE");
		String[] list=f.list();
		
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		}
	}

}
