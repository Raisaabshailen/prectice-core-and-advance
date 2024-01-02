 package First.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setdemo {
	
	public static void main(String[] args) {
		
		Set s=new HashSet();
		s.add("shailendra");
		s.add(100);
		s.add(200);
		s.add(500);
		s.add(200);
		s.add(null);
		s.add(null);
		//System.out.println(s);
		
Iterator itr=s.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next() );
		}
	}

}
