package javaStringArrayExercise;

public class javaStringArray {
	//declare a string array
	 
	String[] array = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	 
	//declare a constructor to setting the first valuable
//	public javaStringArray(String[] array) {
//		this.array = array;
//	}
	public javaStringArray(String[] array) {
		// TODO Auto-generated constructor stub
		this.array = array;
	}
	//Finding the day with most numbers of letters in it 
	public String findingMostNumbersLetters() {
		int longestStringLength = array[0].length();
		String mostNumbersLettersDay = array[0];
		for(int i=1;i<array.length;i++) {
			if(array[i].length()>mostNumbersLettersDay.length()) {
				mostNumbersLettersDay = array[i];
			}
		}
		return mostNumbersLettersDay;
	}
	public String printDayofTheWeekBackwards(String day) {
		//Monday -> yadnoM
		this.array = array;
		String temp_backwards = "";
		for(int i=day.length()-1;i>=0;i--) {
			temp_backwards = temp_backwards + day.charAt(i);
		}
		return temp_backwards;
	}
	
}
