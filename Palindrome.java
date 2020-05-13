package stringsandregex;
/*
 * Author: Srinivasa Narayanam
 * Date 12May2020 Exercise 2
 * Check if a given string is a palindrome or not 
 * Input : "Malayalam"
 * Output : Yes, Palindrome
 * Input : "TestLeaf"
 * Output : No, not a Palindrome
 */
public class Palindrome {

	public static void main(String[] args) {
		
				// Read the original string 
		        System.out.println(" ****************** ");
				String original= "Malayalam";
				System.out.println("The original string is : "+ original);
				
				// Reverse the original string and call it as the reverse string.
		      	String reverse= "";
				for ( int i=original.length()-1;i>=0;i--)
				{
					reverse=reverse+original.charAt(i);
					//System.out.println(" Reverse of original is  " + reverse);
				}
				
				System.out.println("The reverse string is : "+ reverse);
				System.out.println(" ****************** ");
				// compare both strings original and reverse.
				if (original.equals(reverse))
				
				{
					System.out.println("Yes, Palindrome");
				} 
				
				else 
				
				{
					System.out.println("No, not a Palindrome");
				}	
				
	}
				
				
	

}
		


