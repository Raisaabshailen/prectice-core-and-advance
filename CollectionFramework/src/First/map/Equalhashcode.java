package First.map;

public class Equalhashcode {
	
	
	public String name;
	public String rollno;
	public Integer age;
	
	public Equalhashcode(String n,String r,int a) {
		this.name=n;
		this.rollno=r;
		this.age=a;

	}
	
	public boolean equals(Object obj) {
		Equalhashcode e=(Equalhashcode) obj;
		
		boolean b=name.equals(e.name)&&rollno.equals(e.rollno)&&age.equals(e.age);
		
		return b;
	}
	
	public int Hashcode() {
		String key=name+rollno+age;
		return key.hashCode();
	}
	

}
