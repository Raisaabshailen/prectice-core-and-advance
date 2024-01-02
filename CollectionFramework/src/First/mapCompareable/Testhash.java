package First.mapCompareable;

public class Testhash {
	
	public static void main(String[] args) {
		Equalhash e=new Equalhash("shailendra", "r102", 78);
		Equalhash e1=new Equalhash("shailendra", "r102", 78);
		
		System.out.println(e.equals(e1));
		System.out.println(e.hashcode());
		System.out.println(e1.hashcode());
	}

}
