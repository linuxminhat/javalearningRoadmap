package chuong5;

public class b124 {
	//Viết hàm kiểm tra trong mảng các số nguyên có tồn tại giá trị chẵn < 2004 
	public static int[] array = {2005,23333,10000};
	public static boolean findingValueless2004(int[] array) {
		int number=2004;
		for(int i=0;i<array.length;i++) {
			if(array[i]<number) {
				if(array[i]%2==0) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(findingValueless2004(array));
	}

}
