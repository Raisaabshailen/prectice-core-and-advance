package First.mapCompareable;

public class Equalhash {
	
	
	public String name;
	public String rollno;
	public Integer id;
	
	public Equalhash(String n,String r,int id) {
		this.name=n;
		this.rollno=r;
		this.id=id;
	}
	
	public boolean equals(Object obj) {
		Equalhash e=(Equalhash) obj;
		boolean b=name.equals(e.name)&&rollno.equals(e.rollno)&&id.equals(e.id);
		
		return b;
		
	}
	
	
	public int hashcode() {
		String key=name+rollno+id;
		return key.hashCode();
	}

}
