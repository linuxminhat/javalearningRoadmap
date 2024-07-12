package chuong1;

public class b21 {
	public static int number;
	public static int sum=0;
	public static int calDivisorsSum(int number) {
		for(int numb =1;numb<=number;numb++) {
			if(number%numb==0) {
				sum+=numb;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(calDivisorsSum(6)); 
		
	}

}
