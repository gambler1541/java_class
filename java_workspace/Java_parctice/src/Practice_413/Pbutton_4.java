package Practice_413;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

class Pbutton_4 extends Frame {

	public Pbutton_4(String str) {
		super(str);


		setLayout(new FlowLayout());

		Label lbl = new Label("���̺�");
		Button btn = new Button("��ư");

		add(lbl);	
		add(btn);

		setVisible(true);
		setSize(300,300);
	}
	
	public static void main(String[] args) {
		new Pbutton_4("��ư �׽�Ʈ");
	}
}




