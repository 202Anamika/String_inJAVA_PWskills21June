package StringAssignment;

public class DeleteConsonants {
    public static void main(String[] args) {
        String str = "Hello, have a good day";
        
        String result = str.replaceAll("[^aeiouAEIOU\\s]", "");
        
        System.out.println("String after deleting consonants: " + result);
    }
}
