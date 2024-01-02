package First.collection;

import java.util.ArrayList;

public class Reatinarray {
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add(100);
		al.add(500);
		al.add(700);
		 ArrayList al2=new ArrayList();
		 al2.add(100);
		 al2.add(500);
		 
		 System.out.println(al.retainAll(al2));
		 System.out.println(al);
	}

}
