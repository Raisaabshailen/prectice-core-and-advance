package First.mapCompareable;

public class Employee implements Comparable<Employee>{

	private String name;
	private int id;
	
	 public Employee(String n, int id) {
		// TODO Auto-generated constructor stub
	 this.id=id;
	 this.name=n;
	
	}
	 
	
	
	
	
	
	@Override
	public int compareTo(Employee e) {
		if(this.id==(e.id)) {
			return name.compareTo(e.name);
		}else {
			return this.id-e.id;
		}
		
	}
	
	
	public String getName() {
		return name;
	}public int getId() {
		return id;
	}
	
	public String toString() {
		return (name+":"+ id);
	}

}
