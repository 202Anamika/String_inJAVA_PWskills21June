package StringAssignment;
import java.util.*;
public class PalindromeString {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your string: ");
		String str=sc.nextLine();
		
		String Org_str=str;
		String rev="";
		
		for(int i=str.length()-1 ; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		
		if(Org_str.equals(rev))
		{
			System.out.println(Org_str+" --Is Palindrome String");
		}
		else {
			System.out.println(Org_str+"--Is not Palindrome String");
		}
		sc.close();
	}
}
