package lastoop;

public class Circle1 extends Shape1{
	
	public double redius;
	
	public Circle1(double redius) {
		this.redius=redius;
	}
	
	
	
	public double getRedius() {
		return redius;
	}
	
	public void setRedius(double redius) {
		this.redius=redius;
	}
	public double area() {
		return 3.14*redius*redius;
		
	}

}
