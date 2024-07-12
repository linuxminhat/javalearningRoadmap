package chuong1;

public class bai56 {
	//kiem tra so nguyen n co toan so le hay khong 
	public static int number;
	public static boolean checkingNumberAllOdd(int number) {
		while(number>0) {
			int digit=number%10;
			if(digit%2==0) {
				return false;
			}
			number/=10;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(checkingNumberAllOdd(1133579)); 
		System.out.println(checkingNumberAllOdd(1135792));
	}

}
