package arrayAndString;

public class leetcode1295 {
	public int findNumbers(int[] nums) {
        //expected return 12 and 7896 
        int main_count=0;
        for(int element : nums){
            if(ifEventNumbofDigits(element)==true){
            	main_count++;
            }
        }
        return main_count;        
    }
    public boolean ifEventNumbofDigits(int number){
        int count=0;
        while(number>0){
            count++;
            int digit=number%10;
            number/=10;
        }
        if(count%2==0){
            return true;
        }
        return false;
    }
}
