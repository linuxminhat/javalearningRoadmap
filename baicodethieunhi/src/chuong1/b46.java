package chuong1;

public class b46 {
	//đếm số lượng các chữ số lẻ của một số 
	public static int number;
	public static int countOddNumber(int number) {
		 int count =0 ;
		while(number>0) {
			int digits=number%10;
			if(digits%2!=0) {
				count+=1;
			}
			number/=10;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(countOddNumber(9911339));
		
	}

}
