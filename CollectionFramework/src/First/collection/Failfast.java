package First.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Failfast {
	
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(1);
		l.add(4);
		l.add(90);
		l.add(3);
		//l.remove(1);
		 Iterator it = l.iterator();
		l.add(89);	
		
		 while (it.hasNext()) {
			Object obj = (Object) it.next();
			System.out.println(obj);
			
		}
	}

}
