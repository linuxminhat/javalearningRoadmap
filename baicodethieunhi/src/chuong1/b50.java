package chuong1;

public class b50 {
	public static int number;
	public static String reverseANumber(int number) {
		String reverseANumber="";
		while(number>0) {//173 -> 17 
			int digits=number%10;//3 -> 7 
			reverseANumber+=digits;//3 + 7 
			number/=10;//17
			
		}
		return reverseANumber;
	}
	public static void main(String[] args) {
		System.out.println(reverseANumber(173));
	}
}
