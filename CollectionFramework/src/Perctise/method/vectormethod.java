package Perctise.method;

import java.util.Enumeration;
import java.util.Vector;

public class vectormethod {
	
	
	public static void main(String[] args) {
		Vector v=new Vector();
		
		v.add(500);
		v.add(678);
		v.add("shailendra");
		
		System.out.println(v);
		
		System.out.println(v.capacity());
		
		System.out.println(v.size());
		
		Enumeration e=v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}

}
