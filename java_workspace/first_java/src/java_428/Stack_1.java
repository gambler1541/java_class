package java_428;

import java.util.Stack;

public class Stack_1 {

	public static Stack back = new Stack(); 
	public static Stack forward = new Stack(); 

	public static void main(String[] args) {

		goURL("1.Google");
		goURL("2.Daum");
		goURL("3.Nate");
		goURL("4.Naver");

		printprint();

		goBack();
		System.out.println(" �ڷ� ����1 �� ~~");
		printprint();

		goBack();
		System.out.println(" �ڷ� ����2 �� ~~");
		printprint();

		goFoward();
		System.out.println(" ������ ���� 1 ��~~");
		printprint();

		goURL("www.korea.com");
		System.out.println(" ���ο� �ּҷ� �̵� �� ~~");
		printprint();

	}

	private static void goFoward() {
		if (!forward.empty()) {
			back.push(forward.pop());
		}
	}

	private static void goBack() {
		if (!back.empty()) {
			forward.push(back.pop());
		}
	}

	private static void printprint() {
		System.out.println("back 	: " + back);
		System.out.println("forward : " + forward);
		System.out.println("���� ȭ��	: " + back.peek() + "�Դϴ�.");
	}

	private static void goURL(String str) {
		back.push(str);
		if (!forward.empty()) {
			forward.clear();
		}
	}
}

