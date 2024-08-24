package exercise_anagramChecker;

import java.util.Arrays;

public class StringMagic {
	public void bubbleSort(char[] myChar) {
		for(int i=0;i<myChar.length;i++) {
			for(int j=0;j<myChar.length-i-1;j++) {
				if(myChar[j]>myChar[j+1]) {
					char temp=myChar[j];
					myChar[j]=myChar[j+1];
					myChar[j+1]=temp;
				}
			}
		}
	}
	//Converting UpperCase => LowerCase 
	public void convertToLowerCase(char[] myChar) {
		for(int i=0;i<myChar.length;i++) {
			if(myChar[i]>=65 && myChar[i]<=90) {
				myChar[i]+=32;
			}
		}
	}
    public boolean areAnagrams(String str1, String str2) {
    	char[] myChar1 = str1.toCharArray();
    	char[] myChar2 = str2.toCharArray();
    	convertToLowerCase(myChar1);
    	convertToLowerCase(myChar2);
    	bubbleSort(myChar1);
    	bubbleSort(myChar2);
    	if(str1==null || str2==null) {
    		return false;
    	}
    	if(str1.length()==0 || str2.length()==0) {
    		return false;
    	}
      
      return Arrays.equals(myChar1, myChar2);
    }
}