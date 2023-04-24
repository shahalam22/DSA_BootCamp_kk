package LinkedList;

public class CommonTask {
	
	node head;
	
	class node{
		String data;
		node next;
		
		node(String data){
			this.data = data;
			this.next = null;
		}	
	}
	
	//add element in the first place of list
	
	public void addFirst(String value) {
		node newnode = new node(value);
		if(head == null) {
			head = newnode;
			return;
		}
		newnode.next = head;
		head = newnode;
	}
	
	//add element as the last element of the list
	
	public void addLast(String value) {
		node newnode = new node(value);
		if(head == null) {
			head = newnode;
			return;
		}
		node curnode = head;
		while(curnode.next != null) {
			curnode = curnode.next;
		}
		curnode.next = newnode;
		newnode.next = null;
	}
	
	//delete first element of the list
	
	public void deleteFirst() {
		if(head==null) {
			System.out.println("Nothing to delete!");
			return;
		}
		head = head.next;
	}
	
	//delete last element of the list
	
	public void deleteLast() {
		if(head==null) {
			System.out.println("Nothing to delete!");
			return;
		}
		node lastnode = head.next;
		node slnode = head;
		while(lastnode.next != null) {
			slnode = lastnode;
			lastnode = lastnode.next;
			
		}
		slnode.next = null;
	}
	
	//delete a value you entered through methode
	
	public void deleteValue(String value) {
	
		if(head.data==value){
			deleteFirst();
			return;
		}
	
		node curnode = head.next;
		node prevnode = head;
		node nextnode = head.next.next;
		while(nextnode!=null) {
			if(curnode.data==value){
				prevnode.next=nextnode;
				return;
			}
			prevnode = curnode; 
			curnode = nextnode;
			nextnode = nextnode.next;
		}
		if(curnode.data==value){
			deleteLast();
			return;
		}
		System.out.println("Your value doesn't matched");
	}
	
	//printing entire list
	
	public void printList() {
		node curnode = head;
		if(head==null) {
			System.out.println("NULL");
			return;
		}		
		while(curnode!= null) {
			System.out.print(curnode.data + " -> ");
			curnode = curnode.next;
		}
		System.out.println("NULL");
	}
	
	//printing size of the list
	
	public void size() {
		node curnode = head;
		int size = 0;
		if(head==null) {
			System.out.println(size);
			return;
		}
		while(curnode!= null) {
			curnode = curnode.next;
			size++;
		}
		System.out.println(size);
	}
	
	//reversing list through iterate of the list
	
	public void reverseIterate() {
		if(head==null || head.next==null) {
			return;
		}
		
		node prevnode = head;
		node curnode = head.next;
		while(curnode!=null) {
			node nextnode = curnode.next;
			curnode.next = prevnode;
			
			//update
			prevnode = curnode;
			curnode = nextnode;
		}
		head.next = null;
		head = prevnode;
	}
	
	//reversing list using recursive call
	
	public node reverseRecursive(node head) {
		if(head==null || head.next==null) {
			return head;
		}
		node newHead = reverseRecursive(head.next);
		head.next.next = head;
		head.next = null;
		
		return newHead;
	}
	

	public static void main(String[] args) {
		
		CommonTask list = new CommonTask();
		list.addFirst("1");
		list.addFirst("2");
		//list.printList();
		list.addFirst("3");
		//list.printList();
		list.addFirst("4");
		list.printList();
		//list.deleteFirst();
		//list.printList();
		//list.deleteLast();
		//list.printList();
		//list.deleteValue("LinkedList");
		//list.printList();
		//list.size();
		//list.addFirst("Hello, ");
		//list.printList();
		//list.size();
		list.reverseIterate();
		list.printList();
		list.head = list.reverseRecursive(list.head);
		list.printList();

	}

}
