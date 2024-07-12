package chuong1;

public class bai53 {
	public static int number;
	public static int findingNumbExistMax(int number) {
		int numbExistMax=1;
		int available_count=1;
		int new_count=0;
		if(number<9) {
			return number;
		}
		while(number>0) {
			int digits=number%10;
			if(digits==numbExistMax) {
				new_count+=1;
				return digits;
			}
			if(digits>numbExistMax) {
				numbExistMax=digits;
				new_count+=1;
			}
		}
		return numbExistMax;
	}
	public static void main(String[] args) {
		System.out.println(findingNumbExistMax(190983923));
	}

}
