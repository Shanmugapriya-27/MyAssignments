package day2Assignments.week3;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] textArray = text.split(" ");

		Set<String> unique = new LinkedHashSet<String>();
		for (int i = 0; i < textArray.length; i++) {
			unique.add(textArray[i]);				
		}
		
		System.out.println(unique);

		Object[] array = unique.toArray();
		System.out.println(array);

		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}

		
	}

}
