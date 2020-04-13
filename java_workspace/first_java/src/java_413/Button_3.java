package java_413;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Button_3 extends Frame{
	
	Label[] lbl = new Label[50];
	Button[] btn = new Button[50];
	
	public Button_3(String str) {
		super(str);
		setLayout(new FlowLayout());
		
		for (int i = 0; i < 50; i++) {
			lbl[i] = new Label(i + "·¹ÀÌºí");
			btn[i] = new Button(i + "¹öÆ°");
			
			lbl[i].setBackground(new Color((int)((255-190+1)*Math.random()+190),
										   (int)((255-190+1)*Math.random()+190),
										   (int)(Math.random()*60)));
			// ³ë¶û
			btn[i].setBackground(new Color((int)((255-190+1)*Math.random()+190),
										   (int)(Math.random()*60), 
										   (int)(Math.random()*60)));
			// »¡°­ 
			
			add(lbl[i]);
			add(btn[i]);
		}
		
		setSize(800,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Button_3("MY button~~");
	}
}
