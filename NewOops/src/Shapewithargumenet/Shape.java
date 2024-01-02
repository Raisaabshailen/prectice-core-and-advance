package Shapewithargumenet;

public class Shape {
	
	public double area() {
		return 0;
	}
	
	public Shape getShape(int i) {
		 if(i==1) {
			return new Circle(50);
		}else {
			return new Rectangle(30,40);
		}
	}

}
