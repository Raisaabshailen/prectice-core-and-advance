package First.mapCompator;

public class AmitStudent implements Comparable<AmitStudent> {

	public String name;
	public int age;
	
	
	 public AmitStudent(String n,int a) {
		this.age=a;
		this.name=n;
	}
	 
	 public String toString() {
		 return (name+":"+ age);
	 }
	
	
	
	
	@Override
	public int compareTo(AmitStudent o) {
	
		return name.compareTo(o.name);
	}

}
