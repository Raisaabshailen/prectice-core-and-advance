package First.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectinSortreverse {
	
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(89);
		l.add(3);
		l.add(32);
		l.add(6);
		
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		
		Collections.reverse(l);
		System.out.println(l);
	}

}
