package Practice_413;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Pbutton_1_1 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("��ư �׽�Ʈ");
		Button btn = new Button("��ư");
		Label lbl = new Label("���̺�");
		
		btn.setBackground(new Color((int)(Math.random() * 255),(int)(Math.random() * 255),((int)Math.random() * 255)));
		
		ff.setLayout(new FlowLayout());
		
		ff.add(lbl); ff.add(btn);
		
		ff.setVisible(true);
		ff.setSize(300, 300);
	
	}
}
