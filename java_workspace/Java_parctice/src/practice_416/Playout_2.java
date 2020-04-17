package practice_416;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Playout_2 extends Frame{
	public Playout_2(String str) {
	
		super(str);
		setLayout(new FlowLayout());
		setSize(300, 300);
		
		Button[] btn = new Button[50];
		
		
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button("¹öÆ°" + i);
			add(btn[i]);
		}
		setVisible(true);
	}

	public static void main(String[] args) {
		new Playout_2("Playout 2"); 
	} 
	
}
