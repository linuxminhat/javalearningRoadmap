package chuong1;

public class b45 {
	//tim tich cac chu so cua n -> 1234 -> 1*2*3*4=24
	public static int number;
	public static int calProduct(int number) {
		int product=1;
		while(number>0) {
			int digit=number%10;
			product*=digit;
			number/=10;
		}
		return product;
	}
	public static void main(String[] args) {
		System.out.println(calProduct(1234));
	}

}
