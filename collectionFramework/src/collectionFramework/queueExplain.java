package collectionFramework;
import java.util.LinkedList;
import java.util.Queue;

public class queueExplain {

	public static void main(String[] args) {
		// create a Queue using LinkListList
		Queue <String> q1 = new LinkedList<>();
		
		// Adding elements to the queue using add
		q1.add("Apple");
		q1.add("Banana");
		q1.add("Cheery");
		
		// print the queue
		System.out.println("Queue: "+ q1);
		
		// Removing elements from the quere using poll()
		System.out.println("Removed from queue: "+ q1.poll());
		
		// print the queuev again
		System.out.println("Queue after removal: "
		
				+ q1);
		
		
		// adding the element to the queue offer()
	    boolean isAdded1 = q1.offer("Appl");
	    boolean isAdded2 = q1.offer("Mango");
	    boolean isAdded3 = q1.offer("grapes");
	    
	    // apply the remove method()
	     boolean removeed1 =  q1.remove("Mango");
	     System.out.println(q1);
	    
	    System.out.println(q1);
		
		
		
		
		
	

	}

}
