package testknowledge;

import java.util.Arrays;
public class test {
    public String reverseArray(int[] array) {    
        for(int i=0;i<array.length/2;i++){
            int temp_array=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=temp_array;
            
        }
        return Arrays.toString(array);
    }
}