package java_413;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;


// 생성자에서 프레임을 생성하는게 아니라 프레임인스턴스를 생성 뒤 여러 메소드에 접근하는 방식
public class Button_1_1 {
	public static void main(String[] args) {

		Button btn1,btn2,btn3;

		Frame ff = new Frame("가위바위보");

		ff.setLayout(new FlowLayout());
		
		btn1 = new Button("가위");
		btn2 = new Button("바위");
		btn3 = new Button("보");

		ff.add(btn1);
		ff.add(btn2);
		ff.add(btn3);

		btn3.setEnabled(false);

		ff.setSize(300, 200);
		ff.setVisible(true);
	}
}
