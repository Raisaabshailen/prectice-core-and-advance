package First.collection;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class Failsaf {

	
	
public static void main(String[] args) {
		
		ArrayBlockingQueue l = new ArrayBlockingQueue(9);
		l.add(1);
		l.add(4);
		l.add(90);
		l.add(3);
		
		 Iterator it = l.iterator();
		 
		l.add(76);
		l.remove(3);
		 while (it.hasNext()) {
			Object obj = (Object) it.next();
			System.out.println(obj);
	}

}
}
