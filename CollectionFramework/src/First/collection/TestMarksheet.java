package First.collection;

public class TestMarksheet {
	public static void main(String[] args) {
		Marksheet m1=new Marksheet("shailendra","78",456);
		Marksheet m2=new Marksheet("shailendra","78",456);
		
		System.out.println(m1.equals(m2));
		System.out.println(m1.Hashcode());
		System.out.println(m2.Hashcode());
		
}
}