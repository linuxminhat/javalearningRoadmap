package chuong5;

public class b125 {
	//Hàm đếm số lượng số nguyên tố nhỏ hơn 100 trong mảng 
	public static int [] array = {1,2,3,4,5,6,7,8,9,10,
			11,12,13,14,15,16,17,18,19,20};
	public static int number=100;
	public static int countingPrimeNumber(int[] array) {
		int count=0;
		for(int i=0;i<array.length;i++) {
			if(checkingPrimeNumber(array[i])==true && array[i]!=1) {
				count++;
			}
		}
		return count;
	}
	public static boolean checkingPrimeNumber(int numb) {
		for(int i=2;i<numb;i++) {
			if(numb%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(countingPrimeNumber(array));
	}

}
