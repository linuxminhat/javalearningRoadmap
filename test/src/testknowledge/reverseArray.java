package testknowledge;

import java.util.Arrays;

public class reverseArray {
	//1,2,3,4,5 -> 5,4,3,2,1
	int[] array= {1,2,3,4,5};
	public String reverseArray(int[]array) {
		this.array=array;
		for(int i=0;i<array.length/2;i++) {
			int temp_array=array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i]=temp_array;
		}
		return Arrays.toString(array);
	}
	public static void main(String[] args) {
		reverseArray testcase = new reverseArray();
		System.out.println(testcase.reverseArray(testcase.array));
	}

}
