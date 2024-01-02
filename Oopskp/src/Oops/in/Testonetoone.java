package Oops.in;

public class Testonetoone {
	public static void main(String[] args) {
		
	
	
	AddressOneToOne e=new AddressOneToOne("mp","tikamgarh");
	EmpOnetoone e1=new EmpOnetoone("shailendra",1,e);
	
	
	System.out.println(e1.name+":"+e1.id+":"+e1.empaddress.State+":"+e1.empaddress.city);
	}
}
