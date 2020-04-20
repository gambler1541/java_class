package practice_417;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridLayout_1 extends Frame{

	Button[] btn = new Button[8];
	
	public GridLayout_1(String title) {
		super(title);
		setLayout(new GridLayout(8,16));
		
		for (int i = 0; i <btn.length; i++) {
			btn[i] = new Button(i + "Button");
			add(btn[i]);
		}
		
		
		setVisible(true);
		setSize(300, 300);
	}
	public static void main(String[] args) {
		new GridLayout_1("Grid Practice");
	}
}
