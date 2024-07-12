package chuong1;

public class b49 {
	public static int number;
	public static int countingFirstNumber(int number) {
		int firstNumb=0;
		while(number>0) {
			int digits=number%10;
			number/=10;
			firstNumb=digits;
		}
		return firstNumb;
	}
	public static void main(String[] args) {
		System.out.println(countingFirstNumber(3576));
	}

}
