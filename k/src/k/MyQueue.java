package k;
//================================
//CSCI3200_DA_3409_Summer2018
//Nathaniel Parizi 
//Assignment 3 (CH3)
//Problem 5  (Queue)
//================================

import java.util.Iterator;

public class MyQueue<E> implements Iterable<E> {

	//instance variables
	
	private Node<E> start;
	private Node<E> last;
	
	//constructor
	public MyQueue() {
		start = null;
		last = null;
	}
		

	//node
	private static class Node<E> {
		
		private E node;
		private Node<E> next;
		
	}
	
	//iterator
	public Iterator<E> iterator() {
		
		return new ListIterator<E>(start);
	}

	
	//iterator
	private class ListIterator<E> implements Iterator<E> {
		private Node<E> current;

		public ListIterator(Node<E> start) {
			current = start;
		}

		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return current != null;
		}

		@Override
		public E next() {
			// TODO Auto-generated method stub
			if (!hasNext()){
				return null;
			}
			
			
			E node = current.node;
			current = current.next;
			
			return node;
		}


	}
	
	


	//******************************************************methods
		public String toString() {
			
			
			StringBuffer s = new StringBuffer();
			
			
			for (E node : this) {
				
				s.append(node + ", ");
				
			}
			return s.toString();
		}

		public boolean isEmpty() {
			
			
			return start == null;
		}


	public void enqueue(E node) {
		
		Node<E> s = last;
		last = new Node<E>();
		
		
		last.node = node;
		last.next = null;
		
		if (isEmpty()){
			start = last;
		}
		else{
			s.next = last;
		}
	}

	public E dequeue() {
		
		Node<E> s = last;
		last = new Node<E>();
		
		if (start != null) {
			
			
			E node = start.node;
			start = start.next;
			
			if (isEmpty()){
				last = null;
			}
			return node;
			
			
			
		} else {
			
			System.out.println("this queue is empty");
			return null;
			
		}
	}

	public E peek() {
		
		if (!isEmpty()) {
			
			return start.node;
			
		} else{
			System.out.println("the queue is empty");
			
		}
		
		return null;
		
	}

}
