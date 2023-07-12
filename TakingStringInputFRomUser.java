package StringAssignment;
import java.util.*;
public class TakingStringInputFRomUser {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter you String: ");
		String str = sc.nextLine();
		
		System.out.print("You have Enter this string :----->>"+str);
		sc.close();
	}

}
