package java_428;

import java.util.Stack;

public class Stack_1 {
	
	public static Stack<String> back = new Stack<String>();
	public static Stack<String> forward = new Stack<String>();
	
	public static void main(String[] args) {
		
		// back(Stack)�� �����͸� push
		
		goURL("1. Google");
		goURL("2. Daum");
		goURL("3. Nate");
		goURL("4. Naver");
		
		printprint();
		
		goBack();
		System.out.println("goBack ���� 1��");
		printprint();
		
		goBack();
		System.out.println("goBack ���� 2��");
		printprint();
		
		goFoward();
		System.out.println("goFoward ����");
		printprint();
		
		goURL("www.korea.com");
		System.out.println("���ο� �ּҷ� �̵���");
		printprint();
	}
	
	
	// forward(stack)�� �� ������ �ƴ϶��
	// back(stack)�� foward�� �����͸� �־���
	private static void goFoward() {
		if (!forward.empty()) {
			back.push(forward.pop());
		}
	}
	
	// back(stack)�� �� ������ �ƴϸ�
	// forward�� back�� �����͸� �ϳ� �Ѱ���
	private static void goBack() {
		if (!back.empty()) {
			forward.push(back.pop());
		}
	}
	
	// back�� str�� �־���
	// forward�� ������� �ƴϸ� forward�� �ϴ� ����
	private static void goURL(String str) {
		back.push(str);
		if (!forward.empty()) {
			forward.clear();
		}
	}
	
	private static void printprint() {
		System.out.println("back	: " + back);
		System.out.println("forward	: " + forward);
		System.out.println("���� ȭ��    : " + back.peek());
	}
}
