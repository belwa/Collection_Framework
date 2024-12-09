package collectionFramework;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//=============================================================================================================================================
// Q1 this is the forward/backword loop to use of this programme
/*
public class listIterator {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		// using the iterator to forword loop
	         ListIterator itr = list.listIterator();
	         System.out.println("forward loop");
	         while(itr.hasNext()) {
	        	 System.out.println(itr.next());
	         }
	         
	         // using ListIterator to loop backword
	         System.out.println("Backword Loop");
	         while(itr.hasPrevious()) {
	        	 System.out.println(itr.previous());
	         }
	         
        }

	}
*/

//===========================================================================================================================================
// Q2 
/*
public class listIterator {
	
	public static void main (String[] args) {
		
		List list =  new ArrayList();
		list.add("New York");
		list.add("Los Angeles");
		list.add("Chicage");
		list.add("Hiustin");
		list.add("phobessx");
		
		// Using ListIterator to loop forward
		System.out.println("Forward Loop: ");
		ListIterator itr = list.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// Using ListIterator to loop backward
        System.out.println("Backward Loop:");
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
		
	}
}

*/

//=============================================================================================================================================
// Q3 example of the nextmethod and previous method
/*
public class listIterator {
	
	public static void main (String[] args) {
		List list = new ArrayList();
		  list.add(40);
		  list.add(50);
		  list.add(60);
		  list.add(70);
		  list.add(80);
		  
		  // Create the ListIterator
		  ListIterator itr = list.listIterator();
		  // get the next element
		   Object o = itr.next();
		    System.out.println("Current element: "+ o);
		    
		    // appy the current index and previousElement
		    System.out.println("Current index: " + itr.nextIndex());
		    System.out.println("Prevoius index: "+ itr.previousIndex());
			   
		  
		 // Iterator in reverse
	      while(itr.hasPrevious()) {
	    	  // get the prevoius element
	    	  Object ob = itr.previous();
	    	  System.out.println("Current element: "+ ob);
	    	  
	    	  // get the cutrrent index and next index
	    	  
	    	  System.out.println("Current index: " + itr.previousIndex());
	            System.out.println("Next index: " + itr.nextIndex());
	      }
		  
		  
		  
	}
		  
*/		  
		  
		  
		  
		  
		

