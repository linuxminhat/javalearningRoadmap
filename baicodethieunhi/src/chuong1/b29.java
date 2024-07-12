package chuong1;
//tìm ước lẻ lớn nhất của một số 
public class b29 {
	public static int number;
	public static int maxDivisors(int number) {
		int maxNumb = 1;
		for(int numb=1;numb<number;numb++) {
			if(number%numb==0 && numb%2!=0) {
				if(numb>maxNumb) {
					maxNumb=numb;
				}
			}

		}
		return maxNumb;
	}
	public static void main(String[] args) {
		System.out.println(maxDivisors(100));
		
	}

}
