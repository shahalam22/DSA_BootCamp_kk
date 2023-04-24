package StackAndQueue;

//here add complexity O(1), remove complexity O(1), peak complexity O(1)
//solving using array

public class QueueImpTwo {
	
	public static class queue{
		static int arr[];
		static int size;
		static int front = -1;
		static int rear = -1;
		
		queue(int n){
			arr = new int[n];
			queue.size = n;
		}
		
		public static boolean isEmpty() {
			if(rear==-1 && front==-1) return true;
			return false;
		}
		
		public static boolean isFull() {
			if((rear+1)%size==front) return true;
			return false;
		}
		
		public void add(int value) {
			if(isFull()) {
				System.out.println("Queue is full");
				return;
			}
			if(front==-1) front = 0;
			rear = (rear+1)%size;
			arr[rear] = value;
		}
		
		public int remove() {
			if(isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			int result = arr[front];
			if(rear==front) {
				rear = front = -1;
			}
			else {
				front = (front+1)%size;
			}
			return result;
		}
		
		public int peek() {
			if(isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			return arr[front];
		}
	}
	
	

	public static void main(String[] args) {
		
		queue q = new queue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.remove();
		q.add(6);
		
		while(queue.rear>-1) {
			System.out.println(q.peek());
			q.remove();
		}

	}

}
