package First.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listdemo {
	
	public static void main(String[] args) {
		List l=new ArrayList();
		
		l.add("shaile");
		l.add(1,"aaa");
		l.add("aaa");
		l.add(null);
		l.add(null);
	
		
		//System.out.println(l);
		
		
		Iterator itr=l.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next() );
		}
	}

}
