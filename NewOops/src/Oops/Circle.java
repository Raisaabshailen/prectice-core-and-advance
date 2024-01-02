package Oops;

public class Circle extends Shapeoverriding {
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*redius*redius;
	}

	public double redius;
	
	public Circle(double redius) {
		this.redius=redius;
		
	}

}
