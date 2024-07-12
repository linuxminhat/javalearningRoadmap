package testknowledge;

public class usingIntegerminvalue {
	public static int[] array = {1,2,3,4,5,6,7,8,9,10};
	int maxNumber = Integer.MIN_VALUE;
	public int findingMaxNumber(int[]array) {
		for(int number:array) {
			if(number>maxNumber) {
				maxNumber = number;
			}
		}
		return maxNumber;
	}
	public static void main(String[] args) {
		usingIntegerminvalue testcase = new usingIntegerminvalue();
		System.out.println(testcase.findingMaxNumber(array));
	}
}
