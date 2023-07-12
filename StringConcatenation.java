package StringAssignment;

public class StringConcatenation {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        
        // Using the + operator
        String result1 = str1 + " " + str2;
        System.out.println("Using + operator: " + result1);
        
        // Using the concat() method
        String result2 = str1.concat(" ").concat(str2);
        System.out.println("Using concat() method: " + result2);
    }
}
