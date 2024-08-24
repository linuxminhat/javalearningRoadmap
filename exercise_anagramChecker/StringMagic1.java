package exercise_anagramChecker;

public class StringMagic1 {

    public String reverseWordsInSentence(String sentence) {
    	if(sentence==null) {
    		return "INVALID";
    	}
    	if(sentence.length()==0) {
    		return "";
    	}
    	char[] myChar = sentence.toCharArray();
    	int j = myChar.length;
    	char[] reverseChar = new char[j];//Tao mot mang rong 
    	for(int i=0;i<sentence.length();i++) {
    		int jIndex=j-1;
    		reverseChar[jIndex]=myChar[i];
    		jIndex--;
    	}
    	String reverseString = new String(reverseChar);
    	return reverseString;
    }
}