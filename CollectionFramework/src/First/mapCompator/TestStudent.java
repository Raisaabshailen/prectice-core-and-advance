package First.mapCompator;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add(new Student("shailendra", 98));
		al.add(new Student("ram", 78));
		al.add(new Student("nishil", 90));
		al.add(new Student("amit", 91));
		
		
		
		OrderbyName o1=new OrderbyName();
		Collections.sort(al, o1);
		System.out.println(al);
		
		Orderbyno o2=new Orderbyno();
		Collections.sort(al, o2);
		System.out.println(al);
	}

}
