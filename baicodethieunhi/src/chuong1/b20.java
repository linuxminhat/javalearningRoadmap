package chuong1;

import java.util.ArrayList;

public class b20 {
	static ArrayList<Integer> divisorsArray = new ArrayList();
	//liet ke tat ca cac uoc so 
	public static int number;
	public static void nameDivisors(int number) {
		for(int numb=1;numb<=number;numb++) {
			if(number%numb==0) {
				divisorsArray.add(numb);
			}
		}
		System.out.println(divisorsArray.toString());
	}
	public static void main(String[] args) {
		nameDivisors(100);
	}

}
