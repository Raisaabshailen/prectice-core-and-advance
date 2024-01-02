package Compareble;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new Student("shailendra", 1));
		al.add(new Student("kaal", 2));
		al.add(new Student("jaan", 3));
		
		Collections.sort(al);
		System.out.println(al);
	}

}
