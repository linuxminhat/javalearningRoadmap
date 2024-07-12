package chuong4;

import java.util.Scanner;

public class b116 {
	static Scanner inputN = new Scanner(System.in);
	public static int  sumCal() {
		System.out.println("Nhap n");
		int n=inputN.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(sumCal());
	}

}
