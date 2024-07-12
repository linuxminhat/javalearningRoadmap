package chuong1;

public class b60_myself {
	//Kiểm tra tính tăng dần của một số thì chỉ cần so sánh 2 cặp số liên tiếp 
	public static int number;
	public static boolean checkingGreater(int number) {
		String numberString = Integer.toString(number);
		for(int i=0;i<numberString.length()-1;i++) {
			if(numberString.charAt(i)>numberString.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(checkingGreater(12345687));
		System.out.println(checkingGreater(11234567));//lưu ý coi chừng out of range vì có dùng charAt(i+1)
//		checkingGreater(12345687);
		
	}

}
