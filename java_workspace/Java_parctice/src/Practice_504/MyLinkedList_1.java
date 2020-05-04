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
			System.out.println("��ϵ� �����ʹ�");
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
		
		li.add("����");
		li.add("����");
		li.add("�ٴ�");
		li.add("���");
		
		li.print();
	}
}
