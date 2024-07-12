package chuong1;

public class b12 {
	public static int x;
	public static int n;
	public static int powerSeries(int x, int n) //x=2;n=3
	{
		//2*1 + 2*2 + 2*2*2 = 14 
		//2*1 + 2*2 + 2*2*2 + 2*2*2*2 = 30
		//3*1 + 3*3 + 3*3*3 
		int power = x*1;//2 -> biến này luôn khởi tạo rồi nên bỏ qua một bước sum  
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=power;//1:=2 -> 2:6
			power*=x;//2:=4 -> sai ở đoạn này vì power nó tăng lên là cấp số nhân rồi
			
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(powerSeries(377,3));
	}

}
