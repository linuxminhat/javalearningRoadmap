package chuong1;

public class b2 {
	//tinh tong 1^2 den n^2
	public static int n;
	public static int sum=0;
	public static int callSum(int n) {
		for(int i=1;i<=n;i++) {
			sum+=i*i;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(callSum(10));
		
	}

}
