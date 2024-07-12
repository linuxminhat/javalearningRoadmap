package chuong1;

public class b11 {
	public static int n;
	public static int sumSeries(int n ) {
		int sum=0;
		int factorial = 1;
		for(int i=1;i<=n;i++) {
			factorial*=i;
			sum+=factorial;
		}
		return sum;
	}
	public static void main(String[] args) {
		
	}

}
