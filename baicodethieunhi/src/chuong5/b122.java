package chuong5;

public class b122 {
	//viet ham tim gia tri lon nhat trong mang 1 chieu cac so thuc 
	public static int[] array = {2123,122,1356,232};
	//finding max value 
	public static int findingMaxValue(int[] array) {
		int temp_maxValue = array[0];
		for(int number : array) {
			if(number>temp_maxValue) {
				temp_maxValue = number;
			}
		}
		return temp_maxValue;
	}
	public static void main(String[] args) {
		System.out.println(findingMaxValue(array)); 
	}

}
