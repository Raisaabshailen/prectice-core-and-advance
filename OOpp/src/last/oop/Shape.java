package last.oop;

public class Shape {
	
	public double area() {
		return 0;
	}
	
	public Shape getSahpe(int i) {
		if(i==1) {
			return new Circle(30);
		}else {
			return new Rectangle(90,80);
		}
	}

}
