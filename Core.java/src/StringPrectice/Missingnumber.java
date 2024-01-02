package StringPrectice;

public class Missingnumber {
	
	public static void main(String[] args) {
		int[] a={10,20,30};
		int[] b= {10,20};
		int sum=0;
		int sum1=0;
		
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
			
		}for(int i=0; i<b.length; i++) {
			sum1+=b[i];
		}System.out.println(sum-sum1);
	}

}
