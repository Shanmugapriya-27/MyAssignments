package day2Assignments.week3;

import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text =  "PayPal India";
		char[] charArray = text.toCharArray();
		Set<Character> charset = new LinkedHashSet<Character>();
		Set<Character> dupcharset = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			if(charset.add(charArray[i])) {
				dupcharset.add(charArray[i]);
				
			}
			
		}
		//System.out.println(dupcharset);
		Object[] array = dupcharset.toArray();
		for (int i = 0; i < array.length; i++) {
			
		if(array!=null) {
			System.out.print(array[i]);
		}
			
			
			
		}
	}

}
