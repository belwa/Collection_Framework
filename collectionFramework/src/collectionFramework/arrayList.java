package collectionFramework;
import java.util.ArrayList;
import java.util.Collections;


public class arrayList {
	
	public static void main (String[] args) {
		ArrayList <Integer> list = new ArrayList <Integer>();
		
		// add the element
		list.add(0);
		list.add(2);
		list.add(4);
		list.add(8);
		
		System.out.println(list);
		
	   // 	get the element
		   int element = list.get(2);
		   System.out.println(element);
		   
	// add the element between the array
		   list.add(2,5);
		   System.out.println(list);
		   
	// set the method
		   list.add(0,20);
		   System.out.println(list);
	
   // delete
		   list.remove(2);
		   System.out.println(list);
		   
  // size
		   int size = list.size();
		   System.out.println(size);
		   
// loops
		  for(int i=0; i<list.size(); i++) {
			  System.out.print(list.get(i) + " ");
		  }
		  System.out.println();
	
		  
		  Collections.sort(list);
		  System.out.println(list);
	}
}

