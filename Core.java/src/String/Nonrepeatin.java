package String;

public class Nonrepeatin {
public static void main(String[] args) {
	
	
	String s="AASSDDHHB";
	char[] ch=s.toCharArray();
	for(int i=0; i<ch.length; i++) {
		boolean uniqe=true;
		for(int j=0; j<ch.length; j++) {
			if(ch[i]==ch[j]&&i!=j) {
				uniqe=false;
			}
		}if(uniqe) {
			System.out.println(ch[i]);
			break;
		}
	}
}
}
