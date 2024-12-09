package collectionFramework;
import java.util.*;


//Q1 iterating the arraylist
/*
public class collectionFramework {
	
	public static void main (String[] args) {
		Collection <String> list = new ArrayList();
		list.add("Banana");
		list.add("orange");
		list.add("banana");
	
	Iterator it =   list.iterator();
	     while(it.hasNext()) {
	    	 System.out.println(it.next());
	     }
}

}
*/


//============================================================================================================================
// Q2 remove the lement of an array list
/*
public class collectionFramework {
	
	public static void main (String[] args) {
		Collection list = new ArrayList();
		list.add("Mango");
		list.add("Banana");
		list.add("Cherry");
		
		Iterator it = list.iterator();
		 while(it.hasNext()) {
			String fruit = (String) it.next();
			if(fruit.equals("Banana")) {
				it.remove();
			}
		}
		System.out.println(list);
		
	}	
}
*/

		

//============================================================================================================================
// Q3  print the each of the number one by one
/*
public class collectionFramework {
	
	public static void main (String[] args) {
		
		int number = 2398564;
		
		String numberStr = String.valueOf(number);
		
		ArrayList list = new ArrayList();
		
		for(char digit : numberStr.toCharArray()) {
			list.add(Character.getNumericValue(digit));
		}
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Integer value = (Integer) it.next();
			System.out.println(value);
		}
	}
}
*/


//===========================================================================================================================
// Q4 print the each element of the even number
/*
public class collectionFramework {
	
	public static void main (String[] args) {
		
		int number = 2398564;
		
		String numberStr = String.valueOf(number);
		
		ArrayList list = new ArrayList();
		
		for(char digit : numberStr.toCharArray()) {
			if(digit % 2 == 0) {
				list.add(digit);
			}
		}
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
*/

//===========================================================================================================================
// Q5 print the each elemnt of the number is the odd digit
/*
public class collectionFramework {
	
	public static void main (String[] args) {
		int number = 3498568;
		
		String numberStr = String.valueOf(number);
		ArrayList list  = new ArrayList();
		
		for(char digit : numberStr.toCharArray()) {
			if(digit%2== 1) {
				list.add(digit);
			}
		}
		
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		
		}
		
	}
}
*/


//==========================================================================================================================
// Q6 print the each digit of the number count
/*
public class collectionFramework {
	
public static void main (String[] args) {
	int number = 345796867;
	
	String numberStr = String.valueOf(number);
	
	ArrayList list = new ArrayList();
	
     for(char digit : numberStr.toCharArray()) {
   //add each digit to the arrayList 	 
    	 list.add(Character.getNumericValue(digit));
     }
     
     Iterator it  = list.iterator();
     int count = 0;
      while(it.hasNext()) {
    	  Integer digit = (Integer) it.next();
    	  count++;
    	  
      }
      System.out.println("Number of digit greater then : " +count);
}
}
*/

//========================================================================================================================
// Q7 print the max number of each of the digit number 58975856
/*
public class collectionFramework {
	
	public static void main (String[] args) {
		
		int number = 83257579;
		
		String numberStr = String.valueOf(number);
		
		ArrayList list = new ArrayList();
		
		for(char digit : numberStr.toCharArray()) {
			list.add(Character.getNumericValue(digit));
		}
		
		Iterator it = list.iterator();
		int max = 0;
		while(it.hasNext()) {
			Integer value = (Integer) it.next();
			if(value > max) {
				max = value;
			}
		}
		System.out.println("the max value of the number is: "+max);
	}
}
*/
//=================================================================================================================================================================

// Q8 print the biggest and smallest of the number print
/*
public class collectionFramework {
	
	public static void main (String[] args) {
		
		int  number = 89456847;
		
		String numberStr = String.valueOf(number);
		
		ArrayList list = new ArrayList();
		
		for(char digit : numberStr.toCharArray()) {
			list.add(Character.getNumericValue(digit));
		}
		
		Iterator it = list.iterator();
		
		int max = 0;
		int min =0;
		while(it.hasNext()) {
			Integer value = (Integer) it.next();
			if(value > max) {
				max = value;
			}
			
			if(value < min) {
				min = value;
			}
		}
		System.out.println("the maximum element of the number: "+max);
		System.out.println("the minimum element of the number: "+min);
		
	}
}
*/

//=================================================================================================================================================================
	
// Q9 print the sum of umber of the digit
/*
public class collectionFramework {
	
	public static void main (String[] args) {
		int number = 938467;
		
		String numberStr = String.valueOf(number);
		
		ArrayList list = new ArrayList();
		
		for(char digit : numberStr.toCharArray()) {
			list.add(Character.getNumericValue(digit));
		}
		
		Iterator it = list.iterator();
		int sum = 0;
		while(it.hasNext()) {
			Integer value = (Integer) it.next();
			sum = sum+value;
			
			
		}
		
		System.out.println("Sum of the number is "+ sum);
	}
}
*/

//==============================================================================================================================================
// Q10 product of the elemnet
/*
public class collectionFramework {
	
	public static void main (String[] args) {
		
		int number = 4689475;
		String numberStr = String.valueOf(number);
		
		ArrayList list = new ArrayList();
		
		for(int digit : numberStr.toCharArray()) {
			list.add(Character.getNumericValue(digit));
		}
		
		Iterator it = list.iterator();
		int product = 1;
		
		while(it.hasNext()) {
			Integer value = (Integer) it.next();
			product = product*value;
		}
		
		System.out.println("the product of the value is "+product);
	}
	
}
*/

//===============================================================================================================================================
// Q12 print the number of the even number of the sum
/*
public class collectionFramework {
	
	public static void main (String[] args) {
		int number = 587482;
		
		String numberStr = String.valueOf(number);
		
		ArrayList list = new ArrayList();
		
		for(char digit: numberStr.toCharArray()) {
			list.add(Character.getNumericValue(digit));
		}
		
		Iterator it = list.iterator();
		 int sum =0;
		 while(it.hasNext()) {
			 Integer value = (Integer) it.next();
			 if(value%2==0) {
				 sum = sum +value;
			 }
		 }
		System.out.println("the sum of the even number of the value "+sum);
		
		
	}
}
*/

//=====================================================================================================================================================================
// Q13 design a method which accept a collection and remove all the String type element from collection
/*
public class collectionFramework {
	
	public static void main (String[] args) {
		Collection c1 = new ArrayList();
		c1.add(23); c1.add(45.4); c1.add("Mohan");
		c1.add(45); c1.add(44.77); c1.add("Sohan");
		c1.add(200); c1.add(45.8); c1.add(55);
		c1.add(200); c1.add(45.6); c1.add("John");
	}
	
	public static void removeString(Collection c) {
		System.out.println("Collection the before removing String is: ");
		System.out.println(c);
		
		Iterator it = c.iterator();
		  while(it.hasNext()) {
			  Object o = it.next();
				  if(o instanceof String) {
					  it.remove();
				  }
		  }
		  System.out.println("Collection After removing String is: ");
		  System.out.println(c);
		
	  
	}
		
}
*/

//==========================================================================================================================================================
// Q14 design a method will accept a collection and will remove all the elemnt which are not a String
/*
public  class collectionFramework {
	
	public static void main (String[] args) {
		Collection c1 = new ArrayList();
		c1.add(23); c1.add(45.4); c1.add("Mohan");
		c1.add(45); c1.add(44.77); c1.add("Sohan");
		c1.add(200); c1.add(45.8); c1.add(55);
		c1.add(200); c1.add(45.6); c1.add("John");
	}
	
	public static void removeString(Collection c) {
		System.out.println("befoew the remove the element: " );
		
		System.out.println(c);
		
		Iterator it = c.iterator();
		   while(it.hasNext()) {
			   Object o = it.next();
			   if(!(o instanceof String)) {
				   it.remove();
			   }
		   }
		   System.out.println("After the remove the element  is: ");
		   System.out.println(c);
	}
}
*/


//===========================================================================================================================================
// Q15 Design a method which will remove the All the element for a collection
/*
public class collectionFramework {
	
	public static void main (String[] args) {
		Collection c1 = new ArrayList();
		c1.add(23); c1.add(45.4); c1.add("Mohan");
		c1.add(45); c1.add(44.77); c1.add("Sohan");
		c1.add(200); c1.add(45.8); c1.add(55);
		c1.add(200); c1.add(45.6); c1.add("John");
		removeInteger(c1);
		
	}
	
	public static void removeInteger(Collection c) {
		System.out.println("before the removing the element: ");
		
		System.out.println(c);
		
		Iterator it = c.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			
			if(o instanceof Integer)
				it.remove();
		}
		System.out.println("remove After the element ");
		System.out.println(c);
	}
	
}
*/
		
		
		
		


//============================================================================================================================================

// Q17 design the method to count the interger avaibale the collection
/*
public class collectionFramework {
	
	public static void main (String[] args) {
		Collection c1 = new ArrayList();
		c1.add(23); c1.add(45.4); c1.add("Mohan");
		c1.add(45); c1.add(44.77); c1.add("Sohan");
		c1.add(200); c1.add(45.8); c1.add(55);
		c1.add(200); c1.add(45.6); c1.add("John");
		countInteger(c1);
		
	}
	public static void countInteger(Collection c) {
		System.out.println("before the print the element: ");
		System.out.println(c);
		
		Iterator it = c.iterator();
		int count = 0;
		while(it.hasNext()) {
			Object o = it.next();
			if(o instanceof Integer) {
				count++;
			}
		}
		System.out.println("total count of the integer of the value: "+ count);
	}
	
}
*/

//============================================================================================================================================
// Q18 design a method to print the even integer of the method
/*
public class collectionFramework {
	
	public static void main (String[] args) {
		Collection c1 = new ArrayList();
		c1.add(23); c1.add(45.4); c1.add("Mohan");
		c1.add(45); c1.add(44.77); c1.add("Sohan");
		c1.add(200); c1.add(45.8); c1.add(55);
		c1.add(400); c1.add(45.6); c1.add("John");
		removeString(c1);
	}
	
	public static void removeString(Collection c) {
		System.out.println("before the count the event: ");
		
		System.out.println(c);
		
		int count = 0;
		Iterator it = c.iterator();
		  while(it.hasNext()) {
			  Object o = it.next();
				if(o instanceof Integer && (Integer)o%2==0)
					count++;
		  }
		  System.out.println(count);
		
	}
	
}	
*/


















