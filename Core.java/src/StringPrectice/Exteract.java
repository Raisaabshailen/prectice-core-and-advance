package StringPrectice;

import java.util.Arrays;

public class Exteract {
	public static void main(String[] args) {
		
	
	String s="shailendra09876";
	String result="";
	
	int count=0;
	char[] ch=s.toCharArray();
	for(int i=0; i<ch.length; i++) {
		if(Character.isDigit(ch[i])) {
			result=result+String.valueOf(ch[i]);
			count++;
		}
		
	}char[] x=result.toCharArray();
	System.out.println(Arrays.toString(x));
	System.out.println(count);
	}

}
