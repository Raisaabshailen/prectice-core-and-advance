package String;

public final class Immut {
	
	private final int age;
	private final String name;
	 
	
	public Immut(int age,String name) {
		this.age=age;
		this.name=name;
	}


	public int getAge() {
		return age;
	}


	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		Immut a=new Immut(24,"shailendra");
		System.out.println("age:"+a.getAge());
		System.out.println("name:"+a.getName());
	}
	
	

}
