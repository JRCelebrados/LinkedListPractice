
public class LinkedList {
	
Node head = null;
	
	public static void main(String[] args) {
		
		LinkedList linkedlist = new LinkedList();
		
		linkedlist.head = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new  Node(5);
		
		linkedlist.head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		linkedlist.display();
		linkedlist.insertAtBeginning(0);
		linkedlist.display();
		linkedlist.deleteByValue(0);
		linkedlist.display();
		linkedlist.insertAtPosition(3, 3);
		linkedlist.display();
		linkedlist.insertAtEnd(6);
		linkedlist.display();
		
		if(linkedlist.find(1)) {
			System.out.println("Found!");
		}else {
			System.out.println("Not found!");
		}
		
		if(linkedlist.find(7)) {
			System.out.println("Found!");
		}else {
			System.out.println("Not found!");
		}

	}
	
	public void display() {
		
		for(Node curr = head; curr != null; curr = curr.next) {
			System.out.print(curr.x + " ");
		}
		System.out.println();
		
	}
	
	public void deleteByValue(int data) {
		
		if(head.x == data) {
			head = head.next;
			return;
		}
		
		Node prev = head;
		Node curr = prev.next;
		
		while(prev.next != null) {
			if(curr.x == data) {
				prev.next = curr.next;
				curr.next = null;
				
			}
			prev = prev.next;
		}
		
	}
	
	public void insertAtPosition(int x, int position) {
		
		Node newNode = new Node(x);
		Node prev = head;
		int count = 1;
		
		while(count < position - 1){
			prev = prev.next;
			count++;
		}
		
		Node curr = prev.next;
		newNode.next = curr;
		prev.next = newNode;
		
	}
	
	public Node insertAtBeginning(int x) {
		
		Node newNode = new Node(x);
		newNode.next = head;
		head = newNode;
		return head;
		
	}
	
	public Node insertAtEnd(int x) {
		
		Node newNode = new Node(x);
		Node current = head;
		
		while(null != current.next) {
			current = current.next;
		}
		
		current.next = newNode;
		return head;
		
	}
	
	public boolean find(int data) {
		
		Node current = head;
		
		while(current != null) {
			if(current.x == data) {
				return true;
			}
			current = current.next;
		}
		return false;
		
	}

}
