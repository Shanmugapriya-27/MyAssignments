package day2Assignments.week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,2, 4, 5, 7,7,9, 8, 10};
		Set<Integer> uniqueNo = new TreeSet<Integer>();// asckey value - ascending order
		for (int i = 0; i < numbers.length; i++) {
			uniqueNo.add(numbers[i]); //set will have unique nos
		}

		System.out.println(uniqueNo);

		for (int i = 1; i < uniqueNo.size(); i++) {
			if(!uniqueNo.contains(i)) {
				System.out.println(i);

			}

		}
	}

}



