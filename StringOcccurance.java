package stringsandregex;
/*
 * Author: Srinivasa Narayanam
 * Date 12May2020 Exercise 1
 * Write a java program to find the occurrence of the character 'o' in the following String 
 * Input : "You have no choice other than following me
 * Output : Occurrence of O is  6
 */
public class StringOcccurance {

	public static void main(String[] args) {
			
		String str= "You have no choice other than following me";
		System.out.println(" The input string is : "+ str);
		// find the length of the input string
		int length =str.length();
		// convert string into char and read the character at each index
		int Count=0;
		char charAt ; 
		//check each character matches O and count them
		for (int i = 0; i < length; i++)
		{
			charAt = str.charAt(i);
			
			if (charAt =='o')
				{
						Count=Count+1;
						
				}
		}
	//after teh loop print out the count of o in the initial string	
		System.out.println(" Occurance of O is  "+ Count);	
	

		}
}