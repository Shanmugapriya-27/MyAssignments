package week1.day2.assignments;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class FindIntersection {
	
	/*
	 * Pseudo Code
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 *  f) Print the first array (shoud match item in both arrays)
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {3,2,11,4,6,7};
		int[] array2 ={1,2,8,4,9,7};
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if(array1[i]==array2[j]) {
					System.out.println("The intersected numbers are :" + array1[i] + " ");
				}
				
			}
			
		}

	}

}
