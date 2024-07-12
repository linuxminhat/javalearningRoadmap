package arrayList_longestWordFinder;

import java.util.ArrayList;
import java.util.Arrays;

public class longestWordtoFind {
	String sentence;
	public String findingLongestWord(String sentence) {
		this.sentence = sentence;
		if(sentence == null) {
			return "";
		}
		String[] words = sentence.split("");
		int maxLength = 0;
		String longestWord = "";
		
		for(String word:words) {
			if(word.length()>maxLength ) {
				longestWord = word;
			}
		}
		return longestWord;
		
	}
	public static void main(String[] args) {
		longestWordtoFind testcase = new longestWordtoFind();
		System.out.println(testcase.findingLongestWord("I love VIETNAM"));
	}
}
