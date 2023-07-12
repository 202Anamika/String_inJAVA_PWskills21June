package StringAssignment;


import java.util.Scanner;

public class SubstringFind {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.println("Substrings of \"" + input + "\":");
        
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                System.out.println(input.substring(i, j));
                scanner.close();
            }
        }
    }
}
