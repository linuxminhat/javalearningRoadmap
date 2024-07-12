package chuong1;

public class b47 {
	public static int number;
	public static int countSumOfOdd(int number) {
		int sum=0;
		while(number>0) {
			int digits = number%10;
			if(digits%2==0) {
				sum+=digits;
			}
			number/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(countSumOfOdd(2266));
		
	}

}
