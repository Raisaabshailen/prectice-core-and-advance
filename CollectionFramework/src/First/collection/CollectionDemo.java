package First.collection;

import java.util.ArrayList;

public class CollectionDemo {
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		
		al.add(100);
		al.add("shailendra");
		al.add('c');
		
		System.out.println(al);
		
		ArrayList al2=new ArrayList();
		
		al.add("aaaa");
		
		al.add(7888);
		
		al.addAll(al2 );
		
		System.out.println(al);
		
		System.out.println(al.contains(1000));
		
		System.out.println(al.isEmpty());
		
		System.out.println(al.size());
		System.out.println(al.remove(0));
		System.out.println(al);
		
		//al.clear();
		//al.removeAll(al2);
		
	}

}
