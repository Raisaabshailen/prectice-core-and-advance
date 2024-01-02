package First.collection;

public class Testhashcode {
	
	public static void main(String[] args) {
		EqualHashcode e=new EqualHashcode("shailendra","101",5678);
		EqualHashcode e2=new EqualHashcode("shailendra","101",5678);
		
		
		System.out.println(e.equals(e2));
		System.out.println(e.hashcode());
		System.out.println(e2.hashcode());
	}
	

}
