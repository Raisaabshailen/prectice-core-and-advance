package First.collection;

public class Marksheet {
	
	
public	String name;
public	String rollno;
public	Integer marks;
	
	
	public Marksheet(String n, String r, int m) {
		// TODO Auto-generated constructor stub
		this.marks=m;
		this.name=n;
		this.rollno=r;
	}

	public boolean equals(Object obj) {
		
		Marksheet m=(Marksheet) obj;
		boolean b=name.equals(name)&&rollno.equals(rollno)&&marks.equals(marks);
		return b;
		
	}
	
	public int Hashcode() {
		String key = rollno + marks + name;
		return key.hashCode();
	}
	public String toString() {
		return( name + " " + rollno + " " + marks);
		
	}

}
