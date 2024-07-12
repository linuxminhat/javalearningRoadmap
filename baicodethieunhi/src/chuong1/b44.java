package chuong1;

public class b44 {
	public static int number;
	public static int coutingSumOfNumb(int number) {
		int sum=0;
		while(number>0) {
			int digit=number%10;
			sum+=digit;
			number/=10;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(coutingSumOfNumb(222));
		
	}
}
