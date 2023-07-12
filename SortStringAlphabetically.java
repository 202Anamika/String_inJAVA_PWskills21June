package StringAssignment;

import java.util.Arrays;

public class SortStringAlphabetically {
    public static void main(String[] args) {
    	
        String originalString = "programming";
        String sortedString = sortStringAlphabetically(originalString);
        System.out.println(sortedString); 
    }
    
    public static String sortStringAlphabetically(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}