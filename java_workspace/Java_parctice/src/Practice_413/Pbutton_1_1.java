package Practice_413;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Pbutton_1_1 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("버튼 테스트");
		Button btn = new Button("버튼");
		Label lbl = new Label("레이블");
		
		btn.setBackground(new Color((int)(Math.random() * 255),(int)(Math.random() * 255),((int)Math.random() * 255)));
		
		ff.setLayout(new FlowLayout());
		
		ff.add(lbl); ff.add(btn);
		
		ff.setVisible(true);
		ff.setSize(300, 300);
	
	}
}
