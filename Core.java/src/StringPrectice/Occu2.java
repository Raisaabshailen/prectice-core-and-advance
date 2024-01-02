package StringPrectice;

public class Occu2 {
	
	public static void main(String[] args) {
		String s="shailena";
		char[] ch=s.toCharArray();
		int count=0;
		
		for(char c:ch) {
			for(int i=0; i<ch.length; i++) {
				if(c==ch[i]) {
					count++;
				}
			}System.out.println(c+" "+count);
			count=0;
		}
	}

}
