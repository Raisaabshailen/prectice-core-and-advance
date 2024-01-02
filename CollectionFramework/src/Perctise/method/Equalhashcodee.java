package Perctise.method;

public class Equalhashcodee {
	
	
	public String name;
	public String rollno;
	public Integer no;
	
	public Equalhashcodee(String n,String r,int no) {
		this.name=n;
		this.rollno=r;
		this.no=no;
	}
	
	
	public String toString() {
		return (name+rollno+no);
	}
	
	public boolean equals(Object obj) {
		Equalhashcodee e=(Equalhashcodee) obj;
		
		boolean b=name.equals(e.name)&&rollno.equals(e.rollno)&&no.equals(e.no);
		
		return b;
	}
	
	


	public int Hashcode() {
		String key=(name+rollno+no);
		return key.hashCode();
	}

}
