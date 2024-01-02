package String;

import java.io.CharConversionException;
import java.util.Arrays;

public class IntegerArray {
	
	public static void main(String[] args) {
		String s="ss2334";
		int[] num=new int[s.length()];
		int count=0;
		for(int i=0; i<s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
				num[i]=Integer.parseInt(String.valueOf(s.charAt(i)));
				count++;
			}
		}System.out.println(Arrays.toString(num));
	}

}
