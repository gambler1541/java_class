package java_428;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_2 {
	public static void main(String[] args) {
		Stack stt = new Stack();
		
		Queue qq = new LinkedList();	// Linked List�� Queue�������̽��� ����
		
		stt.push("1");	// Stack�� ��ü�� ����
		stt.push("2");
		stt.push("3");
		stt.push("4");

		qq.offer("1");	// Queue�� ��ü�� ���� �����ϸ� true �����ϸ� false
		qq.offer("2");
		qq.offer("3");
		qq.offer("4");
		
		System.out.println("==== Stack ====");
		
		while (!stt.empty()) {
			System.out.println(stt.pop());
			// Stack�� �� ���� ����� ��ü�� ������
		}
		System.out.println("==== Queue ====");
		while (!qq.isEmpty()) {
			System.out.println(qq.poll());
			
			// Queue���� ������ ��������� ���� �߻�
		}
	}
}
