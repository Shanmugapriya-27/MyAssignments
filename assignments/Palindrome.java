package week1.day2.assignments;

public class Palindrome {
	
	/*
	 * Pseudo Code		
	 * a) Declare A String value as"madam"		 
	 * b) Declare another String rev value as ""
	 * c) Iterate over the String in reverse order
	 * d) Add the char into rev
	 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="madami";
		String rev="";
		char[] name1 = name.toCharArray();
		for (int i = name1.length-1; i >= 0; i--) {
			rev=rev+name1[i];		
		}
		if(name.equalsIgnoreCase(rev)) {
			System.out.println("This is Palindrome");
		}else {
			System.out.println("This is not Palindrome");
			//System.out.println(rev);
		}

	}

}
