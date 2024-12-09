package collectionFramework;


//=============================================================================================================================================
// design a class we can create any with genetic we can hold any type object

/*
// create a class 
class Box <T> {
	T t;
	
// create a constructor to initialized 
	  Box(T t){
		  this.t = t;
	  }
	  
// create a method do print the value
	public void getValue() {
		System.out.println("this is the item "+t);
	}
	
}	

	
public class generic {
	public static void main (String[] args) {
	     Box <Integer> b1 = new Box<> (123);
	     b1.getValue();
	     
	     Box <String> b2 = new Box<> ("sunny");
	     b2.getValue();
	}
}
	
*/

//=============================================================================================================================================
// Q2 design a class with the generic to accept the only any two type of object
// Generic Pair definition
/*
class pair <K, V> {
	K key;
	V value;

// Constructor to initialized the pair
	pair(K key, V value){
		this.key = key;
		this.value = value;
	}
	
	// Method to get the key
	public K getKey() {
		return key;
	}
	
	// Method to get the value
	public V getValue() {
		return value;
	}
	
	// method to display to context of the pair
	public void display() {
		System.out.println("the key value is: "+key);
		System.out.println("the value is: "+ value);
		System.out.println("=============================================================================================================");
	}
}

public class generic {
	
	public static void main (String[] args) {
		pair <String, Integer>  p1 = new pair <> ("Alice", 20);
		pair <Integer ,Double> p2 = new pair <>  (123, 41.1);
		pair <String ,String> p3 = new pair <> ("Sunny", "Vishal");
		
		p1.display();
		p2.display();
		p3.display();
		
		
	}
}
*/

//======================================================================================================================================================================

// design a class to acccept the two object of the value
/*
class Pair <K, V> {
	K key;
	V value;
	
	Pair(K key, V value){
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	public void Display() {
		System.out.println("the key item is: "+key);
		System.out.println("the key item is: "+value);
		System.out.println("====================================================================================================================================");
	}
	
}

public class generic {
	
	public static void main (String[] args) {
		
		Pair <String ,Integer> p1 = new Pair <>("Sunny", 123);
		Pair <Integer, String> p2 = new Pair <> (1234, "Vishal");
		p1.Display();
		p2.Display();
		
		
	}
}
*/
//=====================================================================================================================================================================
// GenericMethodExample

public class generic {

    // Generic method that prints an array of any type
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Creating an array of Integers
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer Array:");
        printArray(intArray);

        // Creating an array of Strings
        String[] strArray = {"Hello", "World", "Generic", "Methods"};
        System.out.println("\nString Array:");
        printArray(strArray);

        // Creating an array of Doubles
        Double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println("\nDouble Array:");
        printArray(doubleArray);
    }
}




	


