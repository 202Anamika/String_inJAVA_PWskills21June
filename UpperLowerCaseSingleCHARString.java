package StringAssignment;
import java.util.Scanner;

public class UpperLowerCaseSingleCHARString {
	public static void main(String [] args) {
		
		Scanner r = new Scanner(System.in);
		
		char ch, ch2;
		//ch2=" ";
		System.out.print("Enter Your String: ");
		 ch=r.next().charAt(0);
		 
		 if(ch>='A' && ch<='Z')
		 {
			 ch2=Character .toLowerCase(ch);
			 System.out.print("LowerCase: "+ch2);
		 }
		 else {
			 ch2=Character .toUpperCase(ch);
			 System.out.print("UpperCase: "+ch2);
		 }
		r.close();
	}

}
