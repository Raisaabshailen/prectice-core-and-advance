package String;

public class Numerofinteger {
	
	public static void main(String[] args) {
		String[] s= {"shai9876","ghjk8765"};
		int count=0;
		for(String p:s) {
			char[]ch=p.toCharArray();
			for(int i=0; i<p.length(); i++) {
				if(Character.isDigit(ch[i])) {
					count++;
				}
			}
			System.out.println(p+":"+count);
			
		}
	}

}
