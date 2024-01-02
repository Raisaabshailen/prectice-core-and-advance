package Oops;

public class Testshellowclonning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		 Employeshe e=new  Employeshe();
		
		 
		 
		e.setName("shailendra");
		e.setAddress("indiore");
		 Employesss1 e1=(Employesss1) e.clone();
		e1.setName("shail");
		e1.setAddress("tikamgarh");
		
		
		System.out.println(e.getName());
		System.out.println(e.getAddress());
	    System.out.println(e1.getName());
	    System.out.println(e1.getAddress());
	
	}
	
	 
	 
	 
	 
	

}
