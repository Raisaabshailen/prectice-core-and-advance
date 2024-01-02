package StringPrectice;

public class Vowels {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		
		String name = "Neeraj Rathore";
		
		for(int i = 0; i<name.length(); i++) {
			if(name.charAt(i)== 'a' || name.charAt(i)== 'e' || name.charAt(i)== 'i' || name.charAt(i) == 'o' || name.charAt(i)== 'u') {
				x++;
			}
			else {
				y++;
			}
				
			}
		System.out.println(x);
		System.out.println(y);
}
	}
