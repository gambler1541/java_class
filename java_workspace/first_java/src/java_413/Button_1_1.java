package java_413;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;


// �����ڿ��� �������� �����ϴ°� �ƴ϶� �������ν��Ͻ��� ���� �� ���� �޼ҵ忡 �����ϴ� ���
public class Button_1_1 {
	public static void main(String[] args) {

		Button btn1,btn2,btn3;

		Frame ff = new Frame("����������");

		ff.setLayout(new FlowLayout());
		
		btn1 = new Button("����");
		btn2 = new Button("����");
		btn3 = new Button("��");

		ff.add(btn1);
		ff.add(btn2);
		ff.add(btn3);

		btn3.setEnabled(false);

		ff.setSize(300, 200);
		ff.setVisible(true);
	}
}
