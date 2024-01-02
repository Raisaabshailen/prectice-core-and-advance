package Compareble;

public class Student implements Comparable<Student>{

	
	public String name;
	public int id;
	
	 public Student(String n,int i) {
		this.name=n;
		this.id=i;
		
	}
	 public String toString() {
		 return (name+":"+id);
	 }
	
	
	
	
	@Override
	public int compareTo(Student o) {
		
		return this.id-o.id;
	}

}
