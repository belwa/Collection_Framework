package collectionFramework;

import java.util.Arrays;
import java.util.PriorityQueue;


// Q1 sort all the element of the array

public class PriorityQueueQuestion {

	public static void main(String[] args) {
		
		int [] a = {5,2,8,1,3};
		
		// create a priority Queue
		PriorityQueue <Integer> pq = new PriorityQueue<>();
		
		// Add all the element of the array in priority queue
		for(int num : a) {
			pq.add(num);
		}
		
		// poll the from the priority queue and place back to index of priority queue
		int index = 0;
		while( !pq.isEmpty()) {
			a[index++] = pq.poll();
		}
		
		// print the sortest the array
		System.out.println("Sortest array: "+ Arrays.toString(a));
		




































