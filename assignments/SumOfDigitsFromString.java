package week1.day2.assignments;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Tes12Le79af65";
		int sum = 0;
		char[] textnew = text.toCharArray();
		for (int i = 0; i < textnew.length; i++) {
			char ch = textnew[i];
			if(Character.isDigit(ch)) {
				int digit = Character.getNumericValue(ch);
				sum=sum+digit;
			}

		}
		System.out.println("The sum of digits in a string is :" + sum);

	}

}
