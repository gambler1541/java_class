package java_428;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_2 {
	public static void main(String[] args) {
		Stack stt = new Stack();
		
		Queue qq = new LinkedList();	// Linked List는 Queue인터페이스를 구현
		
		stt.push("1");	// Stack에 객체를 저장
		stt.push("2");
		stt.push("3");
		stt.push("4");

		qq.offer("1");	// Queue에 객체를 저장 성공하면 true 실패하면 false
		qq.offer("2");
		qq.offer("3");
		qq.offer("4");
		
		System.out.println("==== Stack ====");
		
		while (!stt.empty()) {
			System.out.println(stt.pop());
			// Stack의 맨 위에 저장된 객체를 꺼낸다
		}
		System.out.println("==== Queue ====");
		while (!qq.isEmpty()) {
			System.out.println(qq.poll());
			
			// Queue에서 꺼낸다 비어있으면 예외 발생
		}
	}
}
