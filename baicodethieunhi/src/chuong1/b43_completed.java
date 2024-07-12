package chuong1;

public class b43_completed {
	public static int numb;//2812
	public static int countNumberOfNumb(int numb) {
		int count=0;
		while(numb>0) {
			count+=1;
			numb/=10;
		}
		return count;
	}
	public static void main(String[] args) {
		System.out.println(countNumberOfNumb(987654321));
	}

}
