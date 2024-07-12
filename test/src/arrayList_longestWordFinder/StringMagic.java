package arrayList_longestWordFinder;

public class StringMagic {
    
    public String findLongestWord(String sentence) {
        // Edge case: Check if sentence is empty
        if (sentence == null || sentence.trim().isEmpty()) {
            return "";
        }
        
        // Split the sentence into words
        String[] words = sentence.split("\\s+");
        
        // Initialize variables to track the longest word
        String longestWord = "";
        
        // Iterate through each word to find the longest one
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        return longestWord;
    }
    
    public static void main(String[] args) {
        StringMagic stringMagic = new StringMagic();
        
        // Test cases
        String sentence1 = "A quick brown fox jumps over the lazy dog";
        System.out.println("Longest word in \"" + sentence1 + "\": " + stringMagic.findLongestWord(sentence1)); // Output: quick
        
        String sentence2 = "Java is an object oriented programming language";
        System.out.println("Longest word in \"" + sentence2 + "\": " + stringMagic.findLongestWord(sentence2)); // Output: programming
        
        String sentence3 = "";
        System.out.println("Longest word in \"" + sentence3 + "\": " + stringMagic.findLongestWord(sentence3)); // Output: ""
    }
}