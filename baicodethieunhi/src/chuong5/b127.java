package chuong5;

import java.util.Arrays;

public class b127 {
	/*
	 * Sắp xếp mảng 1 chiều theo thứ tự tăng dần 
	 * Ý tưởng : tạo ra 2 giá trị là : previous_arrayValue và next_arrayValue
	 * previous_index và next_index
	 */
	public static int[] array= {123,13,355,121,435,122,424,190};
	//Expected : 13,121,122,123,190,355,424,435
	public static String arrangeArray(int[] array) {
		int[] arrayArange=new int[array.length];
		for(int i=0;i<array.length-1;i++) {
			if(array[i+1]<array[i]) 
				//13<123
			{
				arrayArange[i]=array[i+1];//13
				arrayArange[i+1]=array[i];//1123
			}
		}
		return Arrays.toString(arrayArange);
	}
	public static void main(String[] args) {
		System.out.println(arrangeArray(array)); 
	}
}
