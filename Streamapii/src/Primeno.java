import java.util.ArrayList;

public class Primeno {
	
	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList();
		l.add(13);
		l.add(27);
		l.add(19);
		l.add(123);
		l.add(132);
		l.add(138);
		
		l.stream().filter(e-> prime(e)).forEach(e-> System.out.println(e));
		
	}

	private static boolean  prime(Integer e) {
		int count=0;
		for(int i=2; i<=e; i++) {
			if(e%i==0) {
				count++;
				return false;
			}
		}if(count==0) {
			return true;
		}else {
			return false;
		}
		
	}

}
