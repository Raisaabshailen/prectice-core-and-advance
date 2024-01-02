import java.util.stream.Stream;

public class Randomm {
	
	public static void main(String[] args) {
		Stream.generate(Math::random).limit(2).forEach(e-> System.out.println(e*100));
	}

}
