package Perctise.method;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistmethod {
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add(200);
		al.add(500);
		al.add("shailendra");
		
		System.out.println(al);
		
		System.out.println(al.contains(300));
		System.out.println(al.get(2));
		System.out.println(al.remove(0));
		
		
		Iterator it=al.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
