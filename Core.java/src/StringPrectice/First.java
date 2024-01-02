package StringPrectice;

public class First {
	public static void main(String[] args) {
		String s="shailendra";
		String s1=s.toLowerCase();
		int count=0;
		
		for(char a='a'; a<='z'; a++) {
			for(int i=0; i<s1.length(); i++) {
				if(s1.charAt(i)==a) {
					count++;
				}
			}
			if(count!=0) {
				System.out.println(a+":"+count);
				count=0;
				
			}
			
		}
			}
	}


