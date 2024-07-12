package testknowledge;

import java.util.ArrayList;
import java.util.List;

public class returningFactorOfANumber {
	public List determineAllFactor(int number){
		List<Integer> temp_array = new ArrayList<Integer>();
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				temp_array.add(i);
			}
		}
		return temp_array;
	}
	public static void main(String[] args) {
		returningFactorOfANumber testcase = new returningFactorOfANumber();
		System.out.println(testcase.determineAllFactor(6));
	}

}
