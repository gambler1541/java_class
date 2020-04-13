package Practice_413;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Pbutton_2 extends Frame{

	public Pbutton_2(String str) {
		super(str);

		Button[] btn = new Button[50];
		Label[] lbl = new Label[50];
		
		setLayout(new FlowLayout());
		
		for (int i = 0; i < 50; i++) {
			
			btn[i]= new Button(i + "버튼");
			lbl[i]= new Label(i + "레이블");
			
			btn[i].setBackground(new Color((int)(Math.random() * 255),
											(int)(Math.random() * 255),
											(int)(Math.random() * 255)));
			
			lbl[i].setBackground(new Color((int)(Math.random() * 255),
					(int)(Math.random() * 255),
					(int)(Math.random() * 255)));
			
			
			add(lbl[i]); 
			add(btn[i]);
		}

		setVisible(true);
		setSize(500,500);
	
	}

	public static void main(String[] args) {
		new Pbutton_2("버튼 For");
	}
}
