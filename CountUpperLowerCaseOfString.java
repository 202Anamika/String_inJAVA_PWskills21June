package StringAssignment;
import java.util.Scanner;

public class CountUpperLowerCaseOfString {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        int uppercaseCount = 0;
	        int lowercaseCount = 0;

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);
	            if (Character.isUpperCase(ch)) {
	                uppercaseCount++;
	            } else if (Character.isLowerCase(ch)) {
	                lowercaseCount++;
	            }
	        }

	        System.out.println("Number of uppercase letters: " + uppercaseCount);
	        System.out.println("Number of lowercase letters: " + lowercaseCount);
	        scanner.close();
	    }
	}

