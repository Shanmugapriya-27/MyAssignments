package week1.day2.assignments;

public class ChangeOddIndexToUpperCase {
	
	/*
	 Pseudo Code	 
	 * Declare String Input as Follow	  
	 * String test = "changeme";	 
	 * a) Convert the String to character array	 
	 * b) Traverse through each character (using loop)	 
	 * c)find the odd index within the loop (use mod operator)	 
	 * d)within the loop, change the character to uppercase, if the index is odd else don't change
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] testname = test.toCharArray();

		for (int i = 0; i < testname.length; i++) {
			if(i%2!=0) {
				System.out.print(Character.toUpperCase(testname[i])+ " ");
			}else {
				System.out.print(testname[i]+ " ");
			}

		}

	}

}
