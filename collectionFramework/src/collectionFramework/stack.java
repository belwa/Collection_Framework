package collectionFramework;
import java.util.Stack;


public class stack {

	public static void main(String[] args) {
		// Create a Stack of Integer type
		Stack<Integer> s1 = new Stack<>();
		
		// push the element onto the stack
		s1.push(10);
		s1.push(11);
		s1.push(12);
		s1.push(13);
		s1.push(14);
		
		// display the stack content
		System.out.println("Stack after pushing the element: "+ s1);
		
		// peek at the top element
		System.out.println("stack see the top of the element: "+ s1.peek());
		
		// pop of the element of the stack
		System.out.println("Popped after the element: "+ s1.pop());
		
		// Display the stack after the popping
		System.out.println("Stack after popping an element: "+ s1);
		
		// check if the stack empty
		System.out.println("Is stack is empty: "+ s1.empty());
		
		
	

	}

}
