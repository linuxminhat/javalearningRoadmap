package chuong5;

public class b123 {
	//Tim vi tri ma gia tri vi tri do la gia tri nho nhat trong mang 1 chieu 
	public static int[] array= {1000,923,39,201};
	public static int findingIndex_MaxElements(int[] array) {
		int temp_maxValue = array[0];
		int return_maxIndex = 0;
		for(int i=1;i<array.length;i++) {
			if(array[i]>temp_maxValue) {
				temp_maxValue=array[i];
				return_maxIndex=i;
			}
		}
		return return_maxIndex;
	}
	public static void main(String[] args) {
		System.out.println(findingIndex_MaxElements(array));
	}

}
