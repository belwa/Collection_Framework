package collectionFramework;
import java.util.Vector;

//===============================================================================================================================================================================
// uses of the capacity()
/*
public class vector {

	public static void main(String[] args) {
		Vector <Integer> v1 = new Vector<>(5);
		
		v1.add(1);
		v1.add(2);
		v1.add(3);
		v1.add(4);
		v1.add(5);
		
		System.out.println("capacity adding after adding the 5 element :" + v1.capacity());
		
		v1.add(6);
		System.out.println("capacity after adding the 6th element: "+ v1.capacity());
		
		System.out.println("vector element: "+ v1);

	}

}
*/

//==============================================================================================================================================================================
// (ii) uses of elementAt()
/*
public class vector {
	
	public static void main (String[] args) {
		Vector <String> v2 = new Vector<>();
		v2.add("Apple");
		v2.add("Banana");
		v2.add("Cherry");
		v2.add("Date");
		v2.add("Elderberry");
		
		System.out.println("the element of index: "+ v2.elementAt(0));
		System.out.println("the element of index: "+ v2.elementAt(2));
		System.out.println("the element of index: "+ v2.elementAt(4));
		
		try {
			System.out.println("the element of index: "+ v2.elementAt(5));
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: " +e);
		}
		
	}
}
*/

//===============================================================================================================================================================================
// (iii) uses the ensureCapacity
/*
public class vector {
	
	public static void main (String[] args) {
		Vector <Integer> v3 = new Vector <>(5);
		
		System.out.println("Initial capacity: " +v3.capacity());
		
		// Ensure the vector at least the specified capacity (ex 20)
		v3.ensureCapacity(20);
		System.out.println("Capacity after the ensureCapacity(20 " + v3.capacity());
		
		// add some element of the vector
		for(int i =1; i<=10; i++) {
			v3.add(i);
			
			System.out.println("vector element: "+ v3);
			System.out.println("Capacity after adding the 10 element "+ v3.capacity());
		}
	}
}
*/

//==============================================================================================================================================================================
//(iV) firstElement()
/*
public class vector {
	
	public static void main (String[] args) {
		Vector <String> v4 = new Vector <>();
		v4.add("Aple");
		v4.add("Banana");
		v4.add("Cherry");
		
		String firstElement = v4.firstElement();
        System.out.println("First element: " + firstElement); 
        
        // create a empty vector
        Vector <String> emptyVector = new Vector<>();
        
        try {
        String first = emptyVector.firstElement();
        System.out.println("First element: " + firstElement);
        } catch (NoSuchElementException e) {
            System.out.println("Exception: The vector is empty.");
        }
        	
        }
        
		
	}
}
*/

//==============================================================================================================================================================================
// (v) insertElementAt() = . The insertElementAt() method allows you to insert an element at a specific position in the Vector.
/*
public class vector {
	
	public static void main (String[] args) {
		Vector <Integer> v5 = new Vector<>();
		
		v5.add(10);
		v5.add(20);
		v5.add(30);
		v5.add(40);
		v5.add(50);
		
		System.out.println("Original vector: "+ v5);
		
		// insert at element index of 2
		v5.insertElementAt(25, 2);
		
		System.out.println("Vector after inserting 25 at index 2: "+ v5);
		
	}
	
}
*/

//==============================================================================================================================================================================
// (v) lastElement()= it will return the element of the last postion
/*
public class vector {
	
	public static void main (String[] args) {
		// ceate a vector and add some elements
		Vector <Integer> v6 = new Vector<>();
		v6.add(10);
		v6.add(20);
		v6.add(30);
		v6.add(40);
		
		int lastElement = v6.get(v6.size()-1);
		System.out.println("the last element of the vector is "+ lastElement);
	}
}
*/

//=============================================================================================================================================================================























