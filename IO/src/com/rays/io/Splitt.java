package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Splitt {
	
	public static void main(String[] args) throws IOException {
		int count=0;
		int nol=2;
		String s="C:\\Users\\shailendra rai\\Downloads\\IOZip (1)\\jo banana he\\Me.txt";
		
		File f=new File(s);
		
		//nol
		Scanner sc =new Scanner(f);
		
		while(sc.hasNext()) {
			sc.next();
			count++;
		}
		
		System.out.println(count);//nof
		
		int temp=count/nol;
		int rem=count%nol;
		int nof=0;
		
		if(temp!=0) {
			nof=temp;
		}if(rem!=0) {
			nof++;
		}else {
			nof=temp;
		}
		System.out.println(nof);
		
		
		BufferedReader br=new BufferedReader(new FileReader(s));
		String str;
		for(int i=1; i<=nof;i++) {
			BufferedWriter bw=new BufferedWriter(new FileWriter("d:\\split"+i+".txt"));
			str=br.readLine();
			
			for(int j=0; j<=nol;j++) {
				if(str!=null) {
					bw.write(str);
	    str=br.readLine();
	    if(j!=nol) {
	    	bw.newLine();
	    }
				
				}
			}bw.close();
		}br.close();
		
	}

}
