package java_413;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Button_1 extends Frame{
	
	Button btn1, btn2, btn3;
	
	public Button_1(String str) {
		super(str);
		setLayout(new FlowLayout());	// FlowLayout : �� -> ��� ��ġ�� �Ʒ��� �Ѿ
		
	
		btn1 = new Button("����");
		btn2 = new Button("����");
		btn3 = new Button("��");
		
		add(btn1);
		add(btn2);
		add(btn3);
		
		setSize(300, 300);
		setVisible(true);		// true ���� �־���� â�� ����
	}
	
	public static void main(String[] args) {
		new Button_1("����������");
	}
}
