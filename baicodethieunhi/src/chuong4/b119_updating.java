package chuong4;

public class b119_updating {
	//Ý tưởng là sẽ viết 2 hàm , 1 hàm là kiểm tra số đó có phải là số nguyên tố hay không 
	//Hàm thứ 2 là sẽ in ra số nguyên tố đó 
	public static int number;
	public static void printingPrimeNumberlessThan(int number) {
		for(int i=2;i<number;i++) {
			if(checkingPrimeNumber(i)==true) {
				System.out.println(i);
			}
		}
	}
	public static boolean checkingPrimeNumber(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		printingPrimeNumberlessThan(100);
	}
}
