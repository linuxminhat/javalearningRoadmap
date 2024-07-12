package chuong3;

public class bai90_update {
	public static int n;
	public static int findingm(int n) {
		//1+2+3+4+5+6<20
		//1+2+3+4+5+6+
		//expected : return 5 
		int i=0;
		int sum=0;
		//0<20
//		while(sum<n) {
			for(i=1;sum<n;i++) {
				sum+=i;
				//sum=0
				//i=1 -> sum=0<20 -> sum=0+1=1
				//i=2 -> sum=1<20 -> sum=1+2=3
				//i=3 -> sum=3<20 -> sum=3+3=6
				//i=4 -> sum=6<20 -> sum=6+4=10
				//i=5 -> sum=10<20 -> sum=10+5=15
				//i=6 -> sum=15<20 -> sum=15+6=21
				//i=7 -> sum=21>20 -> nhưng mà đã cộng i lên 7 rồi 
			}
//		}
		return i-2;
	}
	public static void main(String[] args) {
		System.out.println(findingm(104)); 
	}

}
