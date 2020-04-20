package java_420;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;

public class Calc_1 {
	public static void main(String[] args) {
		Frame ff = new Frame("°è»ê±â");
		TextField tf = new TextField("0");
		tf.setEnabled(false);
		
		ff.setSize(190, 160);
		ff.setLocation(300, 300);
		
		ff.add("North", tf);
		Panel numPanel =new Panel();
		Button[] numButtons = null;
		numPanel.setLayout(new GridLayout(4,5,5,5));
		numPanel.setBackground(Color.lightGray);
		
		ff.add("Center", numPanel);
		
		String[] numStr = {"7","8","9","/","CE",
							"4","5","6","*","BS",
							"1","2","3","-","1/x",
							"0","+/-",".","+","="};
		
		numButtons = new Button[numStr.length];
		
		for (int i = 0; i < numStr.length; i++) {
			numButtons[i] = new Button(numStr[i]);
			numButtons[i].setForeground(Color.blue);
			numPanel.add(numButtons[i]);
		}
		
		ff.setResizable(false);
		ff.setVisible(true);
		
	}
	
}
