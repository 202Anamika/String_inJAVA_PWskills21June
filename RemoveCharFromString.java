package StringAssignment;
//import java.util.*;
public class RemoveCharFromString {

	public static void main(String [] args) {
		
		 String s1="World";
		  char c='o';
		  String s2="";
		  
		  for(int i=0; i<s1.length(); i++)
		  {
			  if(c !=s1.charAt(i)) {
				  s2=s2+s1.charAt(i);
			  }
		  }
		  System.out.println(s2);
	}
}
