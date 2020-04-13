package Practice_413;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Pbutton_1 extends Frame{
	
	public Pbutton_1(String str) {
		super(str);
		
		Button btn = new Button("¹öÆ°1");
		setLayout(new FlowLayout());
		
		add(btn);
		
		setVisible(true);
		setSize(500, 500);
		
	}
	
	public static void main(String[] args) {
		new Pbutton_1("Frame Test!!");
	}
	
}
