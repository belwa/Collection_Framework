 package collectionFramework;
 import java.util.*;

/*
// node= Describe this code of the link List
 =========================================================================================================================================================
 /*
	public class linkList {
	    Node head; // Declare head variable
	    private int size;
	    
	    // cerate the constructor of the value
	    linkList(){
	    	this.size = 0;
	    }
	    
	    class Node {
	        String data;
	        Node next;

	        Node(String data) {
	            this.data = data;
	            this.next = null;
	            size++; // value of the size++
	        }
	    }

	    // Add the first node
	    public void addFirst(String data) {
	        Node newNode = new Node(data);
	        newNode.next = head;
	        head = newNode;
	    }
	    
	    // Add the last node
	    public void addLast(String data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }
	        Node currNode = head;
	        while (currNode.next != null) {
	            currNode = currNode.next;
	        }
	        currNode.next = newNode;
	    }
	    
	    // Print the list
	    public void printList() {
	        if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }
	        Node currNode = head;
	        while (currNode != null)  {
	            System.out.print(currNode.data + " ");
	            currNode = currNode.next;
	        }
	        System.out.println("NULL");
	    }
	    
	    // delete first
	    // the head is null
	    public void deleteFirst() {
	    	if(head== null) {
	    		System.out.println("the list is empty");
	    		return;
	    	}
	    	//delete first
	    	size--;
	    	head = head.next;
	    	
	    }
	    // delete last
	    public void deleteLast() {
	    	if(head== null) {
	    		System.out.println("the list is empty");
	    		return;
	    	}	
	    	size--;
	    	if(head.next == null) {
	    		head = null;
	    		return;
	    	}
	    	
	    	Node secondLast = head;
	    	Node lastNode = head.next;  // head.next = null -> lastNode = null
	    	while(lastNode.next != null) { // 
	    		lastNode = lastNode.next;
	    		secondLast = secondLast.next;
	    	}
	    
	    	secondLast.next = null;
	    }    
	    
	    // create the function to return the  size
	       public int getSize() {
	    	   return size;
	       }
	
	    
	    
	    
	    
	    public static void main(String[] args) {
	        linkList list = new linkList();
	        list.addFirst("a");
	        list.addFirst("is");
	        list.printList();
	        
	         list.addLast("List");
	         list.printList();
	         
	         list.addFirst("this");
	         list.printList();
	         
	         list.deleteFirst();
	         list.printList();
	         
	         list.deleteLast();
	         list.printList();
	         
	         System.out.println(list.getSize());
	         
	         // add the list
	         list.addFirst("this");
	         System.out.println(list.getSize());
	         
	    } 
	}
	         
	*/ 
 
 //==========================================================================================================================================================
 // delete the some operation use of the linkList
/*
 public class linkList {
	 
	 public static void main (String[] args) {
		 // crate the empty list
		 LinkedList <String> list = new LinkedList<String>();
		 
		 // addFirst the list
	  	 list.addFirst("a"); // the add first to add the element of a
		 list.addFirst("is"); // add fitst to add the is before the a
		 System.out.println(list);
		 
		 // addLast()
		 list.addFirst("this");
		 list.addLast("list");
		 System.out.println(list);
		 
		 // size of the linkList()
		 System.out.println(list.size());
		 
		 // print the element of the link list
		 for(int i=0; i<list.size(); i++) {
			 System.out.print(list.get(i)+ " -> ");
		 }
		  System.out.println("null");
		  
		  //remove fisrt
		  list.remove();
		  System.out.println(list);
		  
		  // last remove
		 list.removeLast();
		 System.out.println(list);
		 
		 list.remove(1);
		 System.out.println(list);
		 
		 
		 
	 }
 }
 */
 
 //==========================================================================================================================================================
 /*
 public class linkList {
	 
	 public static void main (String[] args) {
		 
		 LinkedList <String> list = new LinkedList<>();
		 
		 // add the element of the linkedlist
		 
		 list.addLast("Second");
		 list.addFirst("First");
		 list.addLast("Third");
		
		 // Display the linkedList & its size
		 System.out.println("LinkedList after the addition: "+ list);
		 System.out.println("size of the linkList: "+ list.size());
		 
		 
		 // add more elements
		 list.addFirst("Zero");
		 list.addLast("fourth");
		 
		 //Display the upadated linklist & updated size
		 System.out.println("Updated linkedList: "+ list);
		 System.out.println("size of the updatedLisklist: "+list.size());
		 
		 // print the element of the linkList
		 for(int i=0; i<list.size(); i++) {
			 System.out.print(list.get(i)+ " -> ");
		 }
		 System.out.println("null");
	 }
 }
*/		 
		 
		 
	 
		 
		 
	         

	

 