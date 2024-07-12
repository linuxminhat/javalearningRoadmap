package chuong1;

public class b43_fail {
	//Đếm số lượng chữ số của số n
	public static int number;
	public static int countingNumber(int number) {
		/*
		 * 173%10=3
		 * -> surplus=3 -> digit=17
		 * 17%10=7
		 * -> surplus=7 -> digit=1
		 * 1%10=1
		 * -> surplus=1 -> digit=0
		 * 
		 */
		int count=0;
		int surplus=number%10;
		for(int digit=number/10;digit>=0; ) {
			count+=1;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(countingNumber(1745));
		
	}

}
