package Perctise.method;

public class TestEqualandHashcode {
	
	public static void main(String[] args) {
		EqualandHashcode e=new EqualandHashcode(10);
		EqualandHashcode e1=new EqualandHashcode(10);
		
		System.out.println(e.equals(e1));
		System.out.println(e.Hashcode());
		System.out.println(e1.Hashcode());
	}

}
