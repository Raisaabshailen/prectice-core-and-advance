import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Evenodd {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> l = new ArrayList();

		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);

		l.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));

	
		
		
	}

}
