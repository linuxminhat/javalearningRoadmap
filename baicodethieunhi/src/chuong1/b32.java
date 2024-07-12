package chuong1;

public class b32 {
	//kiểm tra một số phải số chính phương hay không 
	public static int number;
	public static boolean checkSquareNumb(int number) {
		for(int numb=1;numb<number;numb++) {
			if(number%numb==0) {
				if(numb*numb==number) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		checkSquareNumb(9);
		System.out.println(checkSquareNumb(14));
	}

}
