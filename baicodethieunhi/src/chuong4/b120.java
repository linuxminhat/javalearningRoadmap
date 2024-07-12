package chuong4;

public class b120 {
	//Liệt kê tất cả các số chính phương nhỏ hơn n
	public static int number;
	public static int n;
	//Hàm kiểm tra phải là số chính phương hay không 
	public static boolean checkingSquareNumber(int number) {
		for(int i=2;i<number;i++) {
			if(number==(i*i)) {
				return true;
			}
		}
		return false;
	}
	//Hàm in ra tất cả số chính phương 
	public static void printSquareNumber(int n) {
		for(int i=1;i<n;i++) {
			if((checkingSquareNumber(i)==true)){
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		printSquareNumber(100);
	}

}
