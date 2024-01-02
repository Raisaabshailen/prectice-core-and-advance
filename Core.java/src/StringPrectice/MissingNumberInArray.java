package StringPrectice;


public class MissingNumberInArray {
	public static void main(String[] args) {
		int[] a= {10,20,30};
		int[] b= {10,20};
		int sum1=0;
		int sum2=0;
		
		for(int i=0; i<a.length; i++) {
			sum1+=a[i];
		}
		for(int j=0; j<b.length; j++) {
			sum2+=b[j];
		}
		System.out.println(sum1-sum2);
	}
	

}
