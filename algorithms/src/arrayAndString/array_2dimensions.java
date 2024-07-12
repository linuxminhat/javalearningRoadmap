package arrayAndString;

import java.util.Arrays;

public class array_2dimensions {
	//Khai bao mang 2 chieu 
	public static void main(String[] args) {
		int[][] array= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		//Hoặc 
		int[][] arrays = new int [2][3];
		//Bản chất của mảng 2 chiều là mỗi dòng của nó là mảng 1 chiều 
//		System.out.println(Arrays.toString(array)); -> Arrays.toString không hoạt động mảng 2 chiều 
//		System.out.println(Arrays.deepToString(array));-> Khó đọc 
		for(int[] row:array) {
			for(int elements:row) {
				System.out.print("["+elements+"]");//In ra theo hang truoc : 1 - > 2 -> 3 
			}
			System.out.println("");
		}
	}

}
