package lastoop;

public class Test {
	public static void main(String[] args) {

	//	Shape[] s = new Shape[2];

		/*
		 * s[0]=new Circle(20); s[1]=new Rectangle(24,25);
		 * 
		 * Circle c=(Circle) s[0]; Rectangle r=(Rectangle) s[1];
		 * 
		 * System.out.println(s[0].area()); System.out.println(s[1].area());
		 * 
		 * 
		 * c.SetRedius(21); r.setLength(15); r.setWidth(30);
		 * 
		 * System.out.println(s[0].area()); System.out.println(s[1].area());
		 * 
		 * 
		 * double sum=0; for(int i=0; i<s.length; i++) { sum= sum + s[i].area(); }Sy
		 stem.out.println(sum);*/
		Shape s=new Shape();
		
		Circle c=(Circle) s.getShape(1);
		Rectangle r=(Rectangle) s.getShape(2);
		
		System.out.println(c.area());
		System.out.println(r.area());
		
	
		

	}
}
