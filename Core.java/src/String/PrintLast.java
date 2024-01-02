package String;

public class PrintLast {
	
	public static void main(String[] args) {
		String name="shailendra rai";
		String[] a=name.split(" ");
		String rev="";
		int x=0;
		char[] ch=name.toCharArray();
		
		String s=a[a.length-1];
		System.out.println(s);
		
		for(int i=name.length()-1; i>=0;i--) {
			rev=rev+name.charAt(i);
		}System.out.println(rev);
		
		for(char c:ch) {
			x++;
		}System.out.println(x);
		
		
		
		
	
	
	}

}
