package last.oop;

public class Circle extends Shape {
	
	public double redius;
	public Circle(double redius) {
		this.redius=redius;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*redius*redius;
	}

}
