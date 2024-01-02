package Perctise.method;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
	
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(500);
		l.add("shailendra");
		l.add(800);
		
		System.out.println(l);
		
		System.out.println(l.element());
		
		System.out.println(l.getFirst());
		
		System.out.println(l.peekLast());
		
		
		Iterator it=l.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	
	}

}
