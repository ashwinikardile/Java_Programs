class Node{
	Node next;
	int data ;
	
	public Node(int data) {
		this.data = data;
	}
}
public class linkedList {

	Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public void append(int data) {
		Node cur = head;
		if(head == null) {
			head = new Node(data);
			return;
		}
		while(cur.next != null) {
			cur = cur.next;
		}
		cur.next = new Node(data);
	}
	
	public void insertAtStart(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	
	public void delete(int data) {
		Node cur = head;
		if(head == null)
			return;
		if(head.data == data) {
			head = head.next;
		}
		while(cur.next != null) {
			if(cur.next.data == data) {
				cur.next = cur.next.next;
				return;
			}
			cur = cur.next;
		}
	}
	
	public Node insertNth(int data, int position) {
		Node dummy = new Node(data);
		dummy.next = head;
		
		Node traverse = dummy;
		for(int i=0; i < position; i++) {
			traverse = traverse.next;
		}
		
		Node newNode = new Node(data);
		newNode.next = traverse.next;
		traverse.next = newNode;
		
		return dummy.next;
	}
}
