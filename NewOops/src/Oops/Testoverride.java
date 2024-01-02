package Oops;

public class Testoverride {
	public static void main(String[] args) {
		
	
	
		/*
		 * Shapeoverriding s=new Rectangleover(10,5); Shapeoverriding s1=new Circle(12);
		 * System.out.println(s.area()); System.out.println(s1.area());
		 * 
		 * Shapeoverriding[] s3=new Shapeoverriding[2]
		 */;
	
		 Shapeoverriding[] s=new Shapeoverriding[2];
		 
		 s[0]=new Circle(12);
          s[1]=new	Rectangleover(13,25);
          
          
          System.out.println(s[0].area());
          System.out.println(s[1].area());
	}
}
