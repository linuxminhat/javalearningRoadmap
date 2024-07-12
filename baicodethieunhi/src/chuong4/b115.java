package chuong4;

import java.util.Scanner;

public class b115 {
	 
	public static void main(String[] args) {
	Scanner scanInput = new Scanner(System.in);	
	System.out.println("Nhap vao diem mon toan : ");
	int mathMark = scanInput.nextInt();
	System.out.println("Nhap vao diem mon van");
	int literatureMark = scanInput.nextInt();
	System.out.println("Diem trung binh mon hoc la : " + (mathMark+literatureMark)/2);
	 
		
	}

}
