package com.functionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner4 {
	public static void printingNumberwithFP(List<Integer> list) {
		list.stream().filter(element -> element%2==0).forEach(element -> System.out.println(element));
	}
	public static void printingWithFP(List<String> list) {
		list.stream().filter(element -> element.endsWith("at")).forEach(element -> System.out.println(element));
	}
	public static void main(String[] args) {
		List<String> myList = List.of("DangNhatMinhCat","ChungBat","LinhMat","Dang");
		printingWithFP(myList);
		List<Integer> myList1 = List.of(1,2,4,232,46,13,35,37);
		printingNumberwithFP(myList1);
	}

}
