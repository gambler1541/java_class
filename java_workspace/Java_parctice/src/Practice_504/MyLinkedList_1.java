package Practice_504;

class MyLinkedList{
	Node head = null;
	
	class Node{
	
		String data;
		Node link;
		
		public Node(String data) {
			this.data = data;
		}
	
	}
	
	public void add(String data) {
		Node node = new Node(data);
		
		if (head == null) {
			this.head = node;
		}
		else {
			Node next = head;
			while (next.link != null) {
				next = next.link;
			}
			next.link = node;
		}
	}
	
	public void print() {
		if (head == null) {
			System.out.println("empty list");
		}
		else {
			System.out.println("등록된 데이터는");
			Node next = head;
			while (next != null) {
				System.out.println(next.data);
				next = next.link;
			}
		}
	}
}

public class MyLinkedList_1 {
	public static void main(String[] args) {
		MyLinkedList li = new MyLinkedList();
		
		li.add("가가");
		li.add("나나");
		li.add("다다");
		li.add("라라");
		
		li.print();
	}
}
