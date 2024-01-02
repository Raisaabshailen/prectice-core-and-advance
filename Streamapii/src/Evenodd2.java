import java.util.Arrays;
import java.util.stream.Stream;

public class Evenodd2 {
	
	public static void main(String[] args) {
		Integer[] i= {12,15,18,907};
		
		Stream<Integer> s=Arrays.stream(i);
		
		s.filter(e-> e%2==0).forEach(e-> System.out.println(e));
	}

}
