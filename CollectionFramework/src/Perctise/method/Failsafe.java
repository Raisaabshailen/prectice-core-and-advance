package Perctise.method;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class Failsafe {
	
	public static void main(String[] args) {
		ArrayBlockingQueue al=new ArrayBlockingQueue(9);
		//ArrayList al=new ArrayList();
		
		al.add(567);
		al.add(897);
		System.out.println(al);
		Iterator it=al.iterator();
		al.add(78);
		
		 while (it.hasNext()) {
				Object obj = (Object) it.next();
				System.out.println(obj);
				
			}
		
	}

}
