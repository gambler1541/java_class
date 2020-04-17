package practice_416;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Playout_1 extends Frame {
	
	public Playout_1(String str) {
		super(str);
		
		setSize(300, 300);
		
		Panel pnl = new Panel();
		
		Button[] btn = new Button[50];
		
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button("¹öÆ°" + i);
			pnl.add(btn[i]);
		}
		
		add(pnl);
		
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Playout_1("Layout test");
	}
}
