package chuong1;

public class b7 {
	public static int n;
//	public static int sum=0; => không nên khởi tạo biến sum ở ngoài
	public static int calSum(int n) {
		int sum = 0;
		for(int i =1;i<=n;i++) {
			sum+=(i)/(i+1);
		}
		return sum;
	}
	public static void main(String[] args) {
		
	}

}
