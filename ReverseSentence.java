package StringAssignment;

public class ReverseSentence {
	
	
	    public static void main(String[] args) {
	        String originalSentence = "Think Twice";
	        String reversedSentence = reverseSentence(originalSentence);
	        System.out.println(reversedSentence); // Output: olleH dlroW! woH era uoy?
	    }
	    
	    public static String reverseSentence(String sentence) {
	        String[] words = sentence.split(" ");
	        StringBuilder reversed = new StringBuilder();
	        
	        for (int i = 0; i < words.length; i++) {
	            String word = words[i];
	            StringBuilder reversedWord = new StringBuilder(word).reverse();
	            reversed.append(reversedWord);
	            
	            if (i != words.length - 1) {
	                reversed.append(" ");
	            }
	        }
	        
	        return reversed.toString();
	    }
	}


