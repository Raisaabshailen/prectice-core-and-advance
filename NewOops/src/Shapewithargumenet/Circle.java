package Shapewithargumenet;

public class Circle extends Shape {
	
	public double redius;
	
	public Circle(double r) {
		this.redius=r;
	}

	
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*redius*redius;
	}

}
