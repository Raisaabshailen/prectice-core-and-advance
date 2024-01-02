package First.collection;

import java.util.Stack;

public class Starckk {
	
	public static void main(String[] args) {
		Stack s=new Stack();
		s.add("paroo");
		s.add(200);
		s.push(200000);
		s.push("shailendra");
		
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.search("paroo"));
		System.out.println(s.empty());
	}

}
