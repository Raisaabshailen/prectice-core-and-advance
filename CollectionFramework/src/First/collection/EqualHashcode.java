package First.collection;

public class EqualHashcode {
	
	public String name;
	public String rollno;
	public Integer marks;
	
	
	
	public EqualHashcode(String n,String r,int m) {
		this.name=n;
		this.rollno=r;
		this.marks=m;
	}
	
	public boolean equals(Object obj) {
		EqualHashcode m=(EqualHashcode) obj;
		
		boolean b = rollno.equals(m.rollno) && marks.equals(m.marks) && name.equals(m.name);
		return b;
	}
	
	public int hashcode() {
		String key=rollno+marks+name;
		return key.hashCode();
	}
	

}
