package Oops.in;

public class Overridechild extends Overridee{
  void show() {
	  System.out.println("yes");
  }
  
  public static void main(String[] args) {
	  Overridee o= new Overridee();
	  Overridechild o1=new Overridechild();
	  o.show();
	  o1.show();
}
}
