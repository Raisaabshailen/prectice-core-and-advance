package StringPrectice;

public class Integerextract {
	public static void main(String[] args) {
		String name="shail987";
		int[] x=new int[name.length()];
		
		for(int i=0; i<name.length(); i++) {
			if(Character.isDigit(name.charAt(i))) {
				x[i]=Integer.parseInt(String.valueOf(name.charAt(i)));
			}
		}for(int j:x) {
			if(j!=0) {
				System.out.println(j);
			}
		}
	}

}
