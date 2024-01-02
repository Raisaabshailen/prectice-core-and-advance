package com.rays.io;

import java.io.File;

public class FileDirectory {
	
	public static void main(String[] args) {
		File f=new File("C:\\Users\\shailendra rai\\Downloads\\IOZip\\jo banana HE");
	File[] list=f.listFiles();

	
	for(int i=0; i<list.length; i++) {
		if(list[i].isFile()) {
			System.out.println(list[i].getName());
		}
	}
	
	}

}
