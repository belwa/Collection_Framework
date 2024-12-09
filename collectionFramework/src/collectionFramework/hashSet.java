package collectionFramework;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Set;



/*
public class hashSet {

	public static void main(String[] args) {
		// Crrating
		HashSet <Integer> set = new HashSet<>();
		
		// insert the element
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		// search - contains
		if(set.contains(1)) {
			System.out.println("set contains 1");
		}
		
		if(!set.contains(6)) {
			System.out.println("does not contains");
		}
		
		// delete
		set.remove(1);
		if(!set.contains(1)) {
			System.out.println("does not conains 1");
		}
		
		// size
		System.out.println("the sze of the set is: "+ set.size());
		
		// set the all the element 
		System.out.println(set);
		 
		// Iterator
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		 

	}

}
*/

//===============================================================================================================================================================================

// Q1 from a given array/arrayList remove all the element dublicate element in print it.
/*
public class hashSet {
	
	public static void main (String[] args) {
		ArrayList <Integer> list = new ArrayList<>();
		
		// add the element
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(5);
		
		System.out.println("Print the list: "+ list);
		
		// create the HashSet
		Set <Integer>  set = new HashSet<>(list);
		
		System.out.println("the print set: "+ set);
	}
	
}
*/

//================================================================================================================================================================================
// Q2 find the frequency
/*
public class hashSet {
	
	public static void main (String[] args) {
		int []  a = {12, 23, 45, 12, 20, 45, 12, 17, 12};
		
	}
	
	public static void getFrequency(int[] a) {
		Set <Integer> a1 = new HashSet<>();
		for(int x: a) {
			int count = 0;
			for(int p:a) {
				if(x==p) {
					count++;
				}
				System.out.println(x+ " is: " +count+ " times");
			}
			
		}

	}
		
}
*/

//=================================================================================================================================================================================





