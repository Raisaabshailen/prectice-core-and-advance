package First.collection;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerationss {
	
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(25);
		v.add(75);
		v.add(90);
		v.add(100);
		v.add(83);
		
		Enumeration e=v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
