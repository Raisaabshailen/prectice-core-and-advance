package Perctise.method;

import java.util.LinkedHashMap;

public class Linkedhasmap {

	
	public static void main(String[] args) {
		LinkedHashMap lh=new LinkedHashMap();
		
		lh.put(1, "shailendra");
		lh.put(2, "raisaab");
		
		System.out.println(lh.get(1));
		System.out.println(lh.entrySet());
		System.out.println(lh.keySet());
	}
}
