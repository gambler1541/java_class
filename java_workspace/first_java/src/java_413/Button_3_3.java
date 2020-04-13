package java_413;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Button_3_3{
	public static void main(String[] args) {

		Label[] lbl = new Label[50];
		Button[] btn = new Button[50];

		Frame ff = new Frame("버튼 색상");

		ff.setLayout(new FlowLayout());

		for (int i = 0; i < 50; i++) {
			lbl[i] = new Label(i + "레이블");
			btn[i] = new Button(i + "버튼");
			
			// 노랑	
			lbl[i].setBackground(new Color((int)((255-190+1)*Math.random()+190),
										   (int)((255-190+1)*Math.random()+190),
										   (int)(Math.random()*60)));
			// 빨강 
			btn[i].setBackground(new Color((int)((255-190+1)*Math.random()+190),
										  (int)(Math.random()*60), 
										  (int)(Math.random()*60)));
			
			ff.add(lbl[i]);
			ff.add(btn[i]);
		}
		ff.setSize(800,500);
		ff.setVisible(true);
	}
}


