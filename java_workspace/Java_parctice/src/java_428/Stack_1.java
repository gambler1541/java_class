package java_428;

import java.util.Stack;

public class Stack_1 {
	
	public static Stack<String> back = new Stack<String>();
	public static Stack<String> forward = new Stack<String>();
	
	public static void main(String[] args) {
		
		// back(Stack)에 데이터를 push
		
		goURL("1. Google");
		goURL("2. Daum");
		goURL("3. Nate");
		goURL("4. Naver");
		
		printprint();
		
		goBack();
		System.out.println("goBack 실행 1번");
		printprint();
		
		goBack();
		System.out.println("goBack 실행 2번");
		printprint();
		
		goFoward();
		System.out.println("goFoward 실행");
		printprint();
		
		goURL("www.korea.com");
		System.out.println("새로운 주소로 이동후");
		printprint();
	}
	
	
	// forward(stack)이 빈 공간이 아니라면
	// back(stack)에 foward의 데이터를 넣어줌
	private static void goFoward() {
		if (!forward.empty()) {
			back.push(forward.pop());
		}
	}
	
	// back(stack)이 빈 공간이 아니면
	// forward에 back의 데이터를 하나 넘겨줌
	private static void goBack() {
		if (!back.empty()) {
			forward.push(back.pop());
		}
	}
	
	// back에 str을 넣어줌
	// forward가 빈공간이 아니면 forward를 싹다 지움
	private static void goURL(String str) {
		back.push(str);
		if (!forward.empty()) {
			forward.clear();
		}
	}
	
	private static void printprint() {
		System.out.println("back	: " + back);
		System.out.println("forward	: " + forward);
		System.out.println("현재 화면    : " + back.peek());
	}
}
