package chuong1;

public class b22 {
	public static int number;
	public static int count=0;
	public static int countNumberDivisors(int number) {
		for(int numb =1;numb<=number;numb++) {
			if(number%numb==0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(countNumberDivisors(100));
	}

}
