package lastoop;

public class Rectangle1 extends Shape1{
  public double length;
  public double width;
   public Rectangle1(double length,double width) {
	   this.length=length;
	   this.width=width;
   }
   
   public double area() {
	   return length*width;
   }
}
