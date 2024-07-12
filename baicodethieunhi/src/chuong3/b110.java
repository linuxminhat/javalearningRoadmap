package chuong3;

import java.util.Arrays;

public class b110 {
	public static int m;//200
	public static int n;//100
	public static int p;//40
//	public static int[] plan= {m,n,p};
	public static void main(String[] args) {
		for(m=0;m<=200;m++) {
			for(n=0;n<=100;n++) {
				for(p=0;p<=40;p++) {
					if((m * 1000 + n * 2000 + p * 5000)==200000) {
						 int[] plan = {m, n, p};
						System.out.println(Arrays.toString(plan));
					}
				}
			}
		}
	}
	

}
