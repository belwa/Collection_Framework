package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {

	public static void main(String[] args) {
	
		List <Integer> l1 = new ArrayList<>();
		l1.add(5);
		l1.add(1);
		l1.add(4);
		l1.add(3);
		l1.add(2);
		
		// Sorting the list in natural order
		Collections.sort(l1);
		System.out.println("Sorted the list: "+ l1);
		
		// Reverse the method order list
		Collections.reverse(l1);
		System.out.println("reverse the order: "+ l1);
		
		// Shuffling the list
		Collections.shuffle(l1);
		System.out.println(l1);
		
		

	}

}
