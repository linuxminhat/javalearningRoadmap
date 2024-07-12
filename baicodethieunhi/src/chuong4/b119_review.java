package chuong4;

public class b119_review {
	//List all prime number that less than n 
	//Idea : write two function -> 1/Checking Prime Number -> 2/Printing prime number 
	public static int number;//this number is for checking prime 
	public static int n;
/*
 * public static boolean checkingPrimeNumber(int number) {
		for(int i=2;i<number;i++) {
			if(number%i!=0) {
				return true;//its a prime number -> 2 và 9 
				//Do vậy nên phải đặt ngoài vòng lặp để nó kiểm tra hết đã 
			}
		}
		return false;
	}
	=> trường hợp sai 
 */
//	public static boolean checkingPrimeNumber(int number) {
//		for(int i=2;i<number;i++) {
//			if(number%i==0) {
//				return false;//its a prime number-> chỉ cần 1 trường hợp là trả về false rồi
//				//những trường hợp khác không quan tâm 
//			}
//		}
//		return true;
//	}
	/*
	 * code lại trường hợp sai 
	 */
	public static boolean checkingPrimeNumber(int number) {
		for(int i=2;i<number;i++) {
			if(number%i!=0) {
				return true;//cái này sai ví dụ như 2 và 9 nó trả về true ngay lặp tức
			}
		}
		return false;//như vậy nó không duyệt hết nên thành ra đâu có cái nào trả về false 
	}
	public static void primeNumberlessthan(int n) {
		for(int i=2;i<n;i++) {
			if(checkingPrimeNumber(i)==true) {
				System.out.println(i);//this is prime number
			}
		}
	}
	public static void main(String[] args) {
		primeNumberlessthan(6);
	}
}
