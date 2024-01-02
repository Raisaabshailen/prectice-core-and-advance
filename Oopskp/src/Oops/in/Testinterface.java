package Oops.in;

public class Testinterface {
	public static void main(String[] args) {
		
	
	Interfaceexam i=new Interfaceexam() {
    double b=Interfaceexam.A;
		@Override
		public void add(int a) {
			System.out.println(a+b);
			
			
			
		}

		@Override
		public void sub(int a, int b) {
			System.out.println(a-b);
			
		}
		
	
		
	};
	i.add(100);
	i.sub(100, 50);
	
	}
}
