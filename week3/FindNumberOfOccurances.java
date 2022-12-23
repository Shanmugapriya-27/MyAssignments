package day2Assignments.week3;

import java.util.Map;
import java.util.TreeMap;

public class FindNumberOfOccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Numbers = {2,3,5,6,3,2,1,4,2,1,6,-1};
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < Numbers.length; i++) {
			if(map.containsKey(Numbers[i])) {
				Integer count = map.get(Numbers[i]);
				map.put(Numbers[i], count+1);
				
			}else {
				map.put(Numbers[i], 1);
			}
			
			
		}
		
		System.out.println(map);

	}

}
