package day2Assignments.week3;

import java.util.HashMap;
import java.util.Map;

public class FindMostDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text ="abbaba";
		char[] charArray = text.toCharArray();
		Map<Character,Integer> map= new HashMap<Character,Integer>();
		for (int i = 0; i < charArray.length; i++) {
			if(map.containsKey(charArray[i])) {
				Integer count = map.get(charArray[i]);
				map.put(charArray[i], count+1);
				
			}else {
				map.put(charArray[i], 1);
			}
			
		}
		
		
		System.out.println(map);
	}

}
