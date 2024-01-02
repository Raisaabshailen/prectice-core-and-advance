package StringPrectice;

public class Occurance {
	public static void main(String[] args) {
		String name="shailendra";
		 String s=name.toLowerCase();
		int count=0;
		
		for(char a='a'; a<='z'; a++) {
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i)==a) {
					count++;
				}
			}if(count!=0) {
				System.out.println(a+":"+count);
				count=0;
			}
		}
	}

}
