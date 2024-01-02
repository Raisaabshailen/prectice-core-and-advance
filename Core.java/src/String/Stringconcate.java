package String;

public class Stringconcate {
	public static void main(String[] args) {
		
		String s="shailendra";
		int count=0;
		char[] ch=s.toCharArray();
		for(char c:ch) {
			for(int i=0; i<ch.length; i++) {
				if(ch[i]==c) {
					count++;
				}
			}if(count!=0) {
				System.out.println(c+" "+ count);
			count=0;
			}
		}
	}

}
