package StringPrectice;

import java.util.Arrays;

public class Multipleq {
	public static void main(String[] args) {
		String s="shailendra9899";
		String result="";
		String result1="";
		int count=0;
		char[] ch=s.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(!Character.isDigit(ch[i])) {
				result=result+String.valueOf(ch[i]);
			}else {
				result1=result1+String.valueOf(ch[i]);
				count++;
			}
		}char[] x=result.toCharArray();
		 char[] y=result1.toCharArray();
		 
		 System.out.println(result);
		 System.out.println(count);
		 System.out.println(Arrays.toString(x));
		 System.out.println(Arrays.toString(y));
	}

}
