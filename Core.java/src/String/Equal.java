package String;

public class Equal {

	
	
	public static void main(String[]args) {
		String s1="shailendra rai";
		String s2="shailendra rai";
		String s3="rai";
		
		String s4=new String("shailendra rai");
		String s5=new String("shailendra rai");
		String s6=new String("rai");
		
		
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println(s1==s5);
		System.out.println(s1==s6);
		System.out.println(s1==s4);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals(s5));
		
	}
}
