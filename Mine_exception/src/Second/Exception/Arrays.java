package Second.Exception;

public class Arrays {
public static void main(String[] args) {
	int[] a=new int[5];
	
	try{
		System.out.println(a[8]);
	}catch (ArrayIndexOutOfBoundsException e) {
	e.printStackTrace();
	}
}

}
