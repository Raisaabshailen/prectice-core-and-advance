package Oops;

public class Rectangleover extends Shapeoverriding  {
	
	public double length;
	public double width;
	
	
	public Rectangleover(double length, double width) {
		this.length=length;
		this.width=width;
	}


	@Override
	public double area() {
		return length*width;
	}

}
