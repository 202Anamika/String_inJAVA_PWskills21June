package StringAssignment;
import java.util.Scanner;

public class SubstringINDEX {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        System.out.println("Substrings and their indices:");
	        
	        for (int i = 0; i < input.length(); i++) {
	            for (int j = i + 1; j <= input.length(); j++) {
	                String substring = input.substring(i, j);
	                System.out.println(substring + " - [" + i + ", " + (j - 1) + "]");
	            }
	        }
	        
	        scanner.close();
	    }
	}
