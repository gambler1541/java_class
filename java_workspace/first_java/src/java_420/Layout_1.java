package java_420;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;

public class Layout_1 extends Frame {
	
	
	public Layout_1(String str) {
		super(str);
		
		setLayout(null);	// ���̾ƿ� ������ �����ϱ�
		
		Button btn1 = new Button("��ư 1");
		btn1.setLocation(20, 30);
		btn1.setSize(70, 50);
		add(btn1);
		
		Button btn2 = new Button("��ư 2");
		btn2.setBounds(210, 200, 100, 30);
		add(btn2);
		
		Button btn3 = new Button("��ư 3");
		btn3.setBounds(300, 350, 70, 30);
		add(btn3);
		
		TextArea txt = new TextArea();
		txt.setBounds(50,100,100,150);
		add(txt);
		
		setSize(300, 300);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Layout_1("Layout Null~~");
	}
}
