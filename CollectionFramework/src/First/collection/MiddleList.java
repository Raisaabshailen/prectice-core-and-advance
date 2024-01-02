package First.collection;

import java.util.ArrayList;

public class MiddleList {
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add(100);
		al.add(200);
		al.add(500);
		al.add(80);
		al.add(100);
		al.add(345);
		al.add(200);
		
		System.out.println(al.get((al.size()-1)/2));
	}

}
