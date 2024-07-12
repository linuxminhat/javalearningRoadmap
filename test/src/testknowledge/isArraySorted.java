package testknowledge;

public class isArraySorted {
	public boolean isSorted(int[] array) {
		if(array.length<=1) {
			return true;
		}
		for(int i=0;i<array.length-1;i++) {
			if(array[i]>array[i+1]) {
				return false;
			}
			
		}
		return true;
	}

}
