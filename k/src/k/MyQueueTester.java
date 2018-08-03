package k;
//================================
//CSCI3200_DA_3409_Summer2018
//Nathaniel Parizi 
//Assignment 3 (CH3)
//Problem 5  (Queue)
//================================


public class MyQueueTester {
	
	public static void main(String[] args) {
		MyQueue<String> queue = new MyQueue<String>();
		queue.enqueue("Strawberry");
		queue.enqueue("Peach");
		queue.enqueue("Apple");
		queue.enqueue("Melon");
		System.out.println("*****QUEUE*******\n\n[ " + queue + " ]\n");
		
		
		
		//peek
		System.out.println("Peek:  first in queue:\t" + queue.peek() + " \n");
		
		
		
		System.out.println("enqueue Banana");
		queue.enqueue("Banana");
		System.out.println("[ " + queue + " ]\n");
		
		System.out.println("dequeue: " + queue.peek() + ". ");
		queue.dequeue();
		System.out.println("[ " + queue + " ]\n");
		
	}

}
