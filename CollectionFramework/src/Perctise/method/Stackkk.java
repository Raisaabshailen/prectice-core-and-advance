package Perctise.method;

import java.util.Enumeration;
import java.util.Stack;

public class Stackkk {
	public static void main(String[] args) {
		
	
	Stack s=new Stack();
   s.add("ram");
   s.add("seeta");
   s.add("lakhman");
   
   Stack s1=new Stack();
   s1.add("ram");
   s1.add("seeta");
   s1.add("lakhman");
   
   System.out.println(s.peek());
   System.out.println(s.pop());
   System.out.println(s.push(s1));
   
   System.out.println(s);
   
   Enumeration e=s.elements();
   
   while(e.hasMoreElements()) {
	   System.out.println(e.nextElement());
   }
	
	}
}
