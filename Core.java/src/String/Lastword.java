package String;

public class Lastword {
	public static void main(String[] args) {
		
	
	String s="shailendra rai";
	String[] s1=s.split(" ");
    String a=s1[s1.length-1];
    System.out.println(a);
}
}