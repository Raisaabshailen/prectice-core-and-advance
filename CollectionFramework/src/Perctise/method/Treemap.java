package Perctise.method;

import java.util.TreeMap;

public class Treemap {
	
	public static void main(String[] args) {
		TreeMap t=new TreeMap();
		t.put(1, "shailen");
		t.put(2, "silen");
		t.put(3, "shilen");
		t.put(4, "shn");
		
		
		System.out.println(t.firstEntry());
		System.out.println(t.lastEntry());
		System.out.println(t.firstKey());
		System.out.println(t.lastKey());
		System.out.println(t.replace(1, "ramm"));
		System.out.println(t.keySet());
		System.out.println(t);
		
		
	}

}
