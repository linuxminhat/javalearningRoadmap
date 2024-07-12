package chuong4;

import java.util.Scanner;

public class b115_review {
	public static double mathMark, literatureMark;
	static Scanner markInput = new Scanner(System.in);
	public static double markCalculating() {
		System.out.println("Nhap diem lan luot toan va van ");
		mathMark=markInput.nextDouble();
		literatureMark=markInput.nextDouble();
		System.out.println("Diem mon toan " + mathMark);
		System.out.println("Diem mon van " + literatureMark);
		double averageMark=(mathMark+literatureMark)/2;
		return averageMark;
	}
	public static void main(String[] args) {
		System.out.println(markCalculating());
	}
}
