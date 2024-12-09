package collectionFramework;
import java.util.*;

public class TreeSetA {

	public static void main(String[] args) {
		// Creating a TreeSet of Interger Set
		TreeSet <Integer> treeSet = new TreeSet<>();
		
		// Adding element to the TreeSet
		treeSet.add(10);
		treeSet.add(20);
		treeSet.add(15);
		treeSet.add(5);
		treeSet.add(25);
		
		// trying to added the duplicate element (will not be added)
		    treeSet.add(10);
		    
	   // printing the elements of the TreeSet
		System.out.println("TreeSet elements (sorted) "+ treeSet);
		
		// checking the an element exists in the TreeSet true/false
		System.out.println("Does tree set contains " + treeSet.contains(15));
		
		// Removig the element of the treeSet
		treeSet.remove(20);
		System.out.println("After the removing the 20, treeSet elements: "+ treeSet);
		
		// Get the first and last elements
		System.out.println("First element: "+ treeSet.first());
		System.out.println("last element: "+ treeSet.last());
		
		// Get elements less than or greater than a specific value
		System.out.println("Element less than 15: "+ treeSet.lower(15));
		System.out.println("Element grester then 15: "+ treeSet.higher(15));
		
	}
	
}
		


