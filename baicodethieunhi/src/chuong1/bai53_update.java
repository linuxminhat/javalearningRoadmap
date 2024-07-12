//package chuong1;
//
//public class bai53_update {
//	//If a number = 1253456 -> return 5
//	//6 -> 5 -> 4 -> 3-> 5 -> 2 -> 1 
//	public static int number;
//	public static int findingNumberExistMost(int number) {
//		int numberExistMost=1;//assuming this number is 1 
//		int numberExistMost_count=1;
//		int numberExistHavent_count=0;
//		while(number>0) {
//			int thisDigit=number%10;
//			if(thisDigit==numberExistMost) {
//				numberExistMost_count+=1;
//			}
//			if(thisDigit!=numberExistMost) {
//				numberExistHavent_count+=1;
//			}
//			number/=10;
//		}
//	}
//	public static void main(String[] args) {
//		
//	}
//
//}
