package StackAndQueue;


//here add complexity O(1), remove complexity O(n), peak complexity O(n)
//solving using array

public class QueueImpOne {
	
	public static class queue{
		
		static int arr[];
		static int size;
		static int rear = -1;
		
		queue(int n){
			arr = new int[n];
			queue.size = n;
		}
		
//		public static boolean isEmpty() {
//			if(rear==-1) return true;
//			return false;
//		}
		
		public void add(int value) {
			if(rear==(size-1)) {
				System.out.println("Queue is full.");
				return;
			}
			System.out.println("Entering : "+value);
			rear++;
			arr[rear] = value;
			
		}
		
		public void remove() {
			if(rear==-1) {
				System.out.println("Queue is empty already.");
				return;
			}
			System.out.println("Exiting : "+arr[0]);
			for(int i = 0; i<rear; i++) {
				arr[i] = arr[i+1];
			}
			rear--;
		}
		
		public int peek() {
			if(rear==-1) {
				System.out.println("No element exists.");
				return -1;
			}
			return arr[0];
		}
		
	}
	
	public static void main(String[] args) {
		
		queue q = new queue(5);
		q.add(1);
		q.remove();
		q.add(2);
		q.add(3);
		
		while(queue.rear>-1) {
			//System.out.println(q.peek());
			q.remove();
		}
	}
}

//static class Queue {
//	static int arr[];
//	static int size;
//	static int rear = -1;
//	
//	Queue(int n){
//		arr = new int[n];
//		this.size = n;
//	}
//	
//	public boolean isEmpty() {
//		return (rear == -1);
//	}
//	
//	public void add(int data) {
//		if(rear == size-1) {
//			System.out.println("Full queue");
//			return;
//		}
//		rear++;
//		arr[rear] = data;
//	}
//	
//	public int remove() {
//		if(isEmpty()) {
//			System.out.println("Empty queue.");
//			return -1;
//		}
//		int front = arr[0];
//		for(int i=0; i<rear; i++) {
//			arr[i] = arr[i+1];
//		}
//		rear--;
//		return front;
//	}
//	
//	public int peek() {
//		if(isEmpty()) {
//			System.out.println("Empty queue.");
//			return -1;
//		}
//		return arr[0];
//	}
//	
//}
