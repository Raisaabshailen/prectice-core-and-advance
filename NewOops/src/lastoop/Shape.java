package lastoop;

public class Shape {
	
	public double area() {
		return 0;
	}
	
	public static Shape getShape(int i) {
		if(i==1) {
			return new Circle(20);
		}
		if(i==2) {
			return new Rectangle(25,50);
		}
		return null;
	}

}
