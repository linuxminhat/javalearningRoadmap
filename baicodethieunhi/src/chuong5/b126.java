package chuong5;

public class b126 {
	public static int[] array= {-3,23,12,-3432,121,2345,231};
	public static int summingNegativeValue(int[] array) {
		int sum=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]<0) {
				sum+=array[i];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(summingNegativeValue(array));
	}

}
