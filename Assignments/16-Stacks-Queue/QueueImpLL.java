package StackAndQueue;

public class QueueImpLL {
	
	public static class node {
		int data;
		node next;
		
		node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public static class queue{
		
		static node head = null;
		static node tail = null;
		
		public boolean isEmpty() {
			if(head==null & tail==null) return true;
			return false;
		}
		
		public void add(int value) {
			node newNode = new node(value);
			if(head==null ) {
				head = tail = newNode;
				return;
			}
			tail.next = newNode;
			tail = newNode;
		}
		
		public int remove() {
			if(isEmpty()) {
				System.out.println("Queue is empty!");
				return -1;
			}
			int front = head.data;
			if(head==tail) tail = null;
			head = head.next;
			return front;
		}
		
		public int peek() {
			if(isEmpty()) {
				System.out.println("Empty queue");
				return -1;
			}
			int front = head.data;
			return front;
		}
		
	}

	public static void main(String[] args) {
		
		queue q = new queue();
		q.add(0);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}

	}

}

/*

normal way to work with queue is -> 

Queue<Integer> queueList = new LinkedList<>();		

Queue is an interface, 
which doesn't have any object.
So, for creating object we
used "LinkedList<>()" here.

Queue interface can be accessed through 2 classes. 
1. LinkedList
2. ArrayDeque

*/
