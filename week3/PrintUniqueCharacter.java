package day2Assignments.week3;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Shanmugapriya";
		char[] MyNameArray = text.toCharArray();
		Set<Character> unique = new HashSet<Character>();
		for (int i = 0; i < MyNameArray.length; i++) {
			unique.add(MyNameArray[i]);
		
			
		}
		System.out.println(unique);
	}

}
