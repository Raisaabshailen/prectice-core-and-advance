package String;

public class Prectice {

	public static void main(String[] args) {
		

		/*
		 * String s="shailendra"; for(int i=0; i<s.length(); i++) { char c=s.charAt(i);
		 * System.out.println((int)c); }
		 */

		/*
		 * String[] name= {"shali987"}; int count=0; for(String s:name) { char[]
		 * ch=s.toCharArray(); for(int i=0; i<ch.length; i++) {
		 * if(Character.isDigit(ch[i])) {
		 * count+=Integer.parseInt(String.valueOf(ch[i])); } }System.out.println(count);
		 * }
		 * 
		 * String s="Shailndra"; String s1=s.toLowerCase(); int count=0; for(char a='a';
		 * a<='z'; a++) { for(int i=0; i<s1.length(); i++) { if(s1.charAt(i)==a) {
		 * count++;
		 * 
		 * } }if(count!=0) { System.out.println(a+"="+count); count=0; } }
		 */

		
		String s="shailendra";
		StringBuffer sb=new StringBuffer(s);
	  StringBuffer s1=sb.reverse();
	  System.out.println(s1);
	  
	}

}
