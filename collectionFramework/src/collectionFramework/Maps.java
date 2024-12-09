package collectionFramework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// method 1 Run the loop on map key
/*
public class Maps {

	public static void main(String[] args) {
		Map<Integer, String> m1 = new HashMap<>();
		m1.put(1, "xyz");
		m1.put(2, "Sunny");
		m1.put(3, "Vishal");
		m1.put(4, "Ak");
		
		Set <Integer> key = m1.keySet();
		System.out.println(key);
		
		System.out.println("=====================================================================================================");
		
		for(int p: key) {
			System.out.println(p);
		}
		
	    
	    }

	}

*/
//======================================================================================================================================

// method 2 run the loop one value pair

public class Maps {
	
	public static void main (String[] args) {
		 
		Map<Integer, String> m2 = new HashMap<>();
		
		m2.put(123, "John");
		m2.put(124, "Akshay");
		m2.put(125, "Rani");
		m2.put(126, "Value");
		
		Collection <String> val = m2.values();
		System.out.println("Print the value is: "+ val);
		
		System.out.println("=======================================================================================================");
		
		for(String p : val) {
			System.out.println(p);
		}
		
	}
}


//======================================================================================================================================

// method 3 Run the loop on map enteries
/*
public class Maps {
	
	public static void main (String[] args) {
		
		Map <Integer, String> m3 = new HashMap<>();
		m3.put(32, "xyz");
		m3.put(33, "pqr");
		m3.put(34, "mno");
		m3.put(35, "ori");
		
		Set <Map.Entry<Integer, String>> ent = m3.entrySet();
		System.out.println(ent);
		System.out.println("=====================================================");
		for(Map.Entry<Integer, String> p : ent) {
		   System.out.println(p.getKey()+ " is "+ p.getValue()+ " times ");	
		}
		
		
		
	}
}
*/

//==========================================================================================================================

// Q4 for the given the array retun the number of the max frequency
