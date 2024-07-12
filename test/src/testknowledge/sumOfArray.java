package testknowledge;

public class sumOfArray {
    private int[] array1;
    private int[] array2;
    public sumOfArray(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }
    public boolean areSumsEqual() {
    	int sum1 = calculateSum(array1);
        int sum2 = calculateSum(array2);
        if(sum1!=sum2) {
        	return false;
        }
        return true;
    }
    private static int calculateSum(int[] array) {
    	int temp_sum=0;
    	for(int temp_value:array) {
    		temp_sum=temp_sum+temp_value;
    	}
        return temp_sum;
    }
    public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {3,2,1,5,4};
		System.out.println(calculateSum(array1));
		System.out.println(calculateSum(array2));
		sumOfArray testcase = new sumOfArray(array1,array2);
		System.out.println(testcase.areSumsEqual());
		
	}
}
