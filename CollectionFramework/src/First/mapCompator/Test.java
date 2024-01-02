package First.mapCompator;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {

		ArrayList<Collage> college = new ArrayList<Collage>();

		college.add(new Collage("Shashank", 1000));
		college.add(new Collage("Shekhar", 200));
		college.add(new Collage("Pandey", 90));
		
		System.out.println(college + "\n");
		
		OrderByCollageName  o = new OrderByCollageName();
		
		/*
		 * Collections.sort(college, o); System.out.println(college + "\n");
		 */
		
		OrderbyCollageno o1 = new OrderbyCollageno();
		
		Collections.sort(college, o1);
		System.out.println(college + "\n");
		
	}

}
