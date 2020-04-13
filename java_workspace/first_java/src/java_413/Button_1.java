package java_413;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Button_1 extends Frame{
	
	Button btn1, btn2, btn3;
	
	public Button_1(String str) {
		super(str);
		setLayout(new FlowLayout());	// FlowLayout : 좌 -> 우로 배치후 아래로 넘어감
		
	
		btn1 = new Button("가위");
		btn2 = new Button("바위");
		btn3 = new Button("보");
		
		add(btn1);
		add(btn2);
		add(btn3);
		
		setSize(300, 300);
		setVisible(true);		// true 값을 넣어줘야 창이 보임
	}
	
	public static void main(String[] args) {
		new Button_1("가위바위보");
	}
}
