package chuong1;

public class b31 {
	public static int number;
	public static boolean checkPrimeNumb(int number) {
		int count=0;
		for(int numb=2;numb<number;numb++) {
			if(number%numb==0) {
				count++;
			}
			if(count!=0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(checkPrimeNumb(9));
	}
}
	