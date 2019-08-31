package programming.question;

public class LinkedList {

	public Node head;
	public Node tail;
	
	public LinkedList(){
		head = new Node("head");
		tail = head;
	}
	
	public void add(Node node){
		tail.next = node;
		tail = node;
	}
	
	public Node getHead(){
		return head;
	}
	
	public static class Node{
		
		String data;
		Node next;
		
		public Node(String data){
			this.data = data;
		}
		
		public void setData(String data){
			this.data = data;
		}
	}
	
	public static void main(String args[]){
		LinkedList linkedList = new LinkedList();
		linkedList.add(new LinkedList.Node("1"));
		linkedList.add(new LinkedList.Node("2"));
		linkedList.add(new LinkedList.Node("3"));
		linkedList.add(new LinkedList.Node("4"));
		
		Node head = linkedList.getHead();
		
		while(head.next != null){
			System.out.println(head.next.data);
			head = head.next;
		}
	}
}
