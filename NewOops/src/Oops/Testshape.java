package Oops;

public class Testshape {
	
	
	public static void main(String[] args) {
		Shape[] s=new Shape[2];
		
		s[0]=new Circles();
		s[1]=new Reactangle();
		
		
		Circles c=(Circles) s[0];
		Reactangle r=(Reactangle) s[1];
		
		c.setRedius(21);
		r.setlength(25);
		r.setwidth(4);
		
		System.out.println(r.area());
		System.out.println(c.area());
		
		area(s);
	}

	private static void area(Shape[] s) {
		double totalArea=0;
		
		for(int i=0; i<s.length; i++) {
			totalArea+=s[i].area();
			System.out.println(totalArea);
			
		}
		
	}

}
