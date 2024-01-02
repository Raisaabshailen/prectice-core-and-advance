package First.mapCompator;

import java.util.ArrayList;
import java.util.Collections;

public class TestAmit {
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add(new AmitStudent("shailendra",24));
		al.add(new AmitStudent("shail",27));
		al.add(new AmitStudent("endra",23));
		
		Collections.sort(al);
		
		System.out.println(al);
	}

}
