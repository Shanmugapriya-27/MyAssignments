package day2Assignments.week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Company = {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		List<String> li = new ArrayList<String>();
		for (int i = 0; i < Company.length; i++) {
			li.add(Company[i]);
		}
		Collections.sort(li);
		for (int j = li.size()-1;j >= 0;j--) {
			
			System.out.print(li.get(j)+" ");
		}
		
		

	}

}
