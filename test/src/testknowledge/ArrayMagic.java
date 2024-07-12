package testknowledge;

public class ArrayMagic {
	static int[] array = {-1,0,1};
    public boolean doesHaveElementGreaterThan(int[] array, int number) {
        for(int elements : array){
            if(elements>number){
               return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
		ArrayMagic testcase = new ArrayMagic();
		System.out.println(testcase.doesHaveElementGreaterThan(array,0));
	}
}