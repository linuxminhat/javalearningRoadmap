package testknowledge;

public class final_findingSecondLargestNumber {
	int[] array = {5,5,5,4,4};
	public int findingSecondLargestNumb(int[] array) {
		this.array=array;
		//first you need to find the largest 
		if(array.length==0) {
			return -1;
		}
		int firstLargestElement = Integer.MIN_VALUE;
		int secondLargestElement = Integer.MIN_VALUE;
		for(int value:array) {
			if(value>firstLargestElement) {
				secondLargestElement = firstLargestElement;
				firstLargestElement=value;//Add value -> largestElement 
				
			}else if(value>secondLargestElement && value!=firstLargestElement) {
				secondLargestElement = value; 
			}
//			if(secondLargestElement == Integer.MIN_VALUE) {
//				return -1;
//			}
		}
		return secondLargestElement;
	}
	public static void main(String[] args) {
		final_findingSecondLargestNumber testcase = new final_findingSecondLargestNumber();
		System.out.println(testcase.findingSecondLargestNumb(testcase.array));
	}

}
