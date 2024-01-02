package Oops;

public class Overloading {
	
	
	public void sum(int a,int b) {
		
		System.out.println(a+b);
		
	}
	
	public void  sum(int a,int b,int c) {
		
		System.out.println(a+b+c);
		
	}
	
	public static void main(String[] args) {
		
	
	Overloading o=new Overloading();
	o.sum(20, 30);
    o.sum(20, 30, 40);
	}
	
	

}
