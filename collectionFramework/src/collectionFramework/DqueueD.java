package collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

// addFisrt()
/*
public class DqueueD {

	public static void main(String[] args) {
	// create a Dqueue in linklist
		Deque <Integer> q1 = new LinkedList<>();
		q1.addFirst(10);
		q1.addFirst(20);
		q1.addFirst(30);
		
		// print the dqueue
		System.out.println("Deque after addFisrt operation: "+ q1);

	}

}
*/

//===================================================================================================================================================
// addLast()
/*
public class DqueueD {
	
	public static void main (String[] args) {
		
		// create a Deque in LinkedList
		
		Deque <Integer> q1 = new LinkedList<>();
		q1.addLast(23);
		q1.addLast(24);
		q1.addLast(25);
		
		// print the Deque
		System.out.println("Deque afterFirst operation: "+ q1);
	}
}
*/

//====================================================================================================================================
// offerFirst()
/*
public class  DqueueD {
	
	public static void main (String[] args) {
		// Create a Deque using ArrayDeque
		 Deque <String> q3 = new ArrayDeque<>();
		 
		 // Add the elements to the deque
		 q3.add("Apple"); // adds to front
		 q3.add("Mango");
		 q3.add("Orange");
		 
		 // dispay after add deque addditions
		 System.out.println("Deque after offerFirst: " + q3);
		 
		 // remove element of the front
		 System.out.println("Deque after offerFirst: "+ q3.pollFirst());
		 
		 // Display the deque after removal
		 System.out.println("Dequeue after pollFirst: "+ q3);
		
	}
	
}
*/

//=====================================================================================================================================
// offerLast()
/*
public class DqueueD {
	
	public static void main (String[] args) {
		// Create a Deque using LinkedList
		Deque <String> q4 = new LinkedList<>();
		
		// Add element to the deque offerLast()
        q4.offerLast("A");
        q4.offerLast("B");
        q4.offerLast("C");
        
        // print the dqueue
        System.out.println("Deque after adding the element to the end: "+ q4);
	}
	
}
*/

//============================================================================================================================================
// removeFirst()
/*
public class DqueueD {
	
	public static void main (String[] args) {
		
		// create a Deque using LinkedList
		Deque <String> q5 = new LinkedList<>();
		
		// Add the element to the deque RemiveFirst()
		q5.addLast("Apple");
		q5.addLast("Vishal");
		q5.addLast("Sunny");
		q5.addLast("Tree");
		
		// print Deque before removal
		System.out.println("print the Deque before removal: "+ q5); 
		
		// remove the first element (front of the deque)
		String removeElement = q5.removeFirst();
		
		// print the deque after removal
		System.out.println("Removed element:" + removeElement);
		System.out.println("Deque after removeFirst() "+ q5);
		
		
		
		
		
	}
}
*/

//======================================================================================================================================
public class DqueueD {
	
	public static void main (String[] args) {
		
		// create the Deque using ArrayDeque
		Deque <String> d6 = new ArrayDeque<>();
		
		// add the element of the Deque
		d6.add("Apple");
		d6.add("Mango");
		d6.add("Orange");
		d6.add("Banana");
		d6.add("guava");
		
		// print the add the deque before use of removeLast
		System.out.println("Initial dequeue "+ d6);
		
		// remove the last element of usong removeLast
		String removedElement = d6.removeLast();
		
		// print the element after the remove method()
		System.out.println("Dequeue after removeLast() " + d6);
		
	}
	
	
}









































