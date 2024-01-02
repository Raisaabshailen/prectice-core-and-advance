package Perctise.method;

import java.util.HashSet;

public class Hashset {
	
	public static void main(String[] args) {
		HashSet<String> h=new HashSet();
		
		h.add("raisaab");
		h.add("shailendra");
		System.out.println(h.contains(200));
		
		
		System.out.println(h);
		
		for(String s:h) {
			System.out.println(s);
		}
	}

}
