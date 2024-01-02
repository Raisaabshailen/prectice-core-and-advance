package Oops.in;

public class EmpOnetoone {
	
	String name;
	int id ;
	AddressOneToOne empaddress ;
	
	public  EmpOnetoone() {
		
	}
	public  EmpOnetoone(String name,int id,AddressOneToOne empaddress) {
		this.name=name;
		this.id=id;
		this.empaddress=empaddress;
	}

}
