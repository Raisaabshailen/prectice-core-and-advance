package String;

public class Duplicate {

public static void main(String[] args) {
	String s="shailendra";
	int length=s.length();
	char[] ch=s.toCharArray();
	
	for(int i=0; i<s.length();i++) {
		for(int j=i+1; j<s.length();j++) {
			if(ch[j]==ch[i]) {
				System.out.println(ch[j]);
				
			}
			
		}
	}
}
	
}