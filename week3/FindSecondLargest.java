package day2Assignments.week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		Set<Integer> datset = new TreeSet<Integer>();
		
		for (int i = 0; i < data.length; i++) {
			
			datset.add(data[i]); //no duplicates in set 
		}
		
		List<Integer> SecondMo = new ArrayList<Integer>();
		SecondMo.addAll(datset);
		Collections.sort(SecondMo);
		System.out.println(SecondMo);
		System.out.println(SecondMo.size());
		
		System.out.println("The Second largest element is:"+ SecondMo.get(SecondMo.size()-2));
		

	}

}
