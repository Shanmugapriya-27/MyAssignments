package week1.day2.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		//0,1,2,3,4,5,6
		Arrays.sort(arr);
		//System.out.println(arr.length);
		
		int digit =0;
		for (int i = 1; i < arr.length; i++) {
			 digit =arr[i-1];
			 //System.out.println(i);		 
			
			if(digit!=i) {
				System.out.println("The Missing element in array is :" + i);
				break;
				
			}
			
		}
		

		
	}

}
