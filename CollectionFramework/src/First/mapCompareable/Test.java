package First.mapCompareable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		List l = new ArrayList();
		l.add(new Employee("shailendra", 1));
		l.add(new Employee("jay ho", 2));
		l.add(new Employee("shailen", 1));
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
	}

}
