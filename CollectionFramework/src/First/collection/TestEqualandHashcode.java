package First.collection;

public class TestEqualandHashcode {
	public static void main(String[] args) {
		EqualandHashcode e1 = new EqualandHashcode(10);
		EqualandHashcode e2 = new EqualandHashcode(10);
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashcode());
		System.out.println(e2.hashcode());
	}

}
