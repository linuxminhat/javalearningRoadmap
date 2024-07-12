package chuong1;

public class b13 {
	public static int x;
	public static int n;
	public static int sumSeries(int x, int n) {
//		x^2 + x^4 + ... + x^2n
		//2*2 + (2*2)*(2*2) + (2*2)*(2*2)*(2*2)
		int sum=0;
		int factorial=1;
		for(int i=2;i<=2*n;i=i+2) {
			factorial*=(x*x);
			sum+=factorial;
			
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(sumSeries(2,3));
		
	}

}
