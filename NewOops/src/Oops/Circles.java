package Oops;

public class Circles extends Shape {
	
	public int redius;

	public int getRedius() {
		return redius;
	}

	public void setRedius(int redius) {
		this.redius = redius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*redius*redius;
	}
	
	
	

}
