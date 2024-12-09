package collectionFramework;

import java.util.Arrays;

public class ArraysExplain {

	public static void main(String[] args) {
		
		// Example of Array
		int [] a = {5, 2, 8, 3, 1, 7};
		
		// 1. sort() - Sorting the array
		 Arrays.sort(a);
		 System.out.println("Sorting the arrays: "+ Arrays.toString(a));
		 
		 // 2. binarySearch() - search the index of the value
		 int index = Arrays.binarySearch(a, 3);
		 System.out.println("the array index of 3: "+ index);
		 
		 // 3 toString() - it is used to convertin the array into String representation
		 System.out.println("Arrays as String: "+ Arrays.toString(a));
		
		 
		 // 4 equals()- comparing two arrays for equality
		   int [] arr =  {5, 2, 8, 3, 1, 7};
		   boolean isEqual = Arrays.equals(a, arr);
		  System.out.println("Arrays are equas: "+ isEqual );
		

	}

}
