package Oops;

public class Reactangle extends Shape {
	
	public int  length;
	public int width;
	
	
	public int getlength() {
		return length;
	}
	public void setlength(int length) {
		this.length=length;
	}
	
	public int getwidth() {
		return width;
	}
	public void setwidth(int width) {
		this.width=width;
	}
	@Override
	public double area() {
		
		return length*width;
	}

}
