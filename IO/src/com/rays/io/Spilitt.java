package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Spilitt {
	
	public static void main(String[] args) throws IOException {
		String s="d:\\mera.txt";
		int count=0;
		int nol=2;
		File f=new File(s);
		
		//nol
		
		Scanner sc=new Scanner(f);
		while(sc.hasNext()) {
			sc.next();
			count++;
		}
		
		//nof
		
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
		
		BufferedReader br=new BufferedReader(new FileReader(s));
		
		for(int i=1;i<=nof;i++) {
			String str;
			BufferedWriter bw=new BufferedWriter(new FileWriter("d://spilit"+i+".txt"));
			str=br.readLine();
			for(int j=0; j<=nol;j++) {
				
				
				if(str!=null) {
					bw.write(str);
					str=br.readLine();
					if(j!=nol) {
						bw.newLine();
					}
				}
			}
		}
	}

}
