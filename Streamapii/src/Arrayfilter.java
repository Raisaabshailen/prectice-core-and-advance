import java.util.Arrays;
import java.util.stream.Stream;

public class Arrayfilter {
	
	public static void main(String[] args) {
		String[] s= {"one","two","four","twenty"};
		Stream<String> a=Arrays.stream(s);
		
		a.map(e-> e.toUpperCase()).sorted().filter(e-> e.startsWith("T"))
		.forEach(e->System.out.println(e));
	}

}
