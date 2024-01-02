package Perctise.method;

public class Equalhashcode {
	
	public String name;
	public String rollno;
	public Integer marks;
	
	public Equalhashcode(String n,String r,int m) {
		this.name=n;
		this.rollno=r;
		this.marks=m;
	}
	
	public boolean equals(Object obj) {
		Equalhashcode e=(Equalhashcode) obj;
		boolean b=name.equals(e.name)&&rollno.equals(e.rollno)&&marks.equals(e.marks);
		return b;
	}

	
	public int Hashcode() {
		String key=name+rollno+marks;
		return key.hashCode();
	}
}
