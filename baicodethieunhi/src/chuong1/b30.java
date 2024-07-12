package chuong1;

public class b30 {
	public static int number;
	public static void checkPerfectNumber(int number) {
		int sum=0;
		boolean isPerfect = false;
		for(int numb=1;numb<number;numb++) {
			if(number%numb==0) {
				sum+=numb;
			}
			if (sum == number) {
	            isPerfect = true;
	        }

	        if (isPerfect) {
	            System.out.println("Số " + number + " là số hoàn thiện");
	        } else {
	            System.out.println("Số " + number + " không là số hoàn thiện");
	        }
	    }
		}
	
	public static void main(String[] args) {
		checkPerfectNumber(7);
		
	}

}
