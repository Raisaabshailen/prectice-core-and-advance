package lastoop;

public class Circle extends Shape{

	private double redius;
	/*
	 * double redius;
	 * 
	 * 
	 * public double getRedius() { return redius; }
	 * 
	 * public void SetRedius(double r) { this.redius=r; }
	 */
	
	public Circle(double redius) {
		this.redius=redius;
	}
	@Override
	public double area() {
		
		return 3.14*redius*redius;
	}
}
