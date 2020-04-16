package java_416;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;

public class Canvas_1 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("CanvasTest ~~~ ");
		
		ff.setSize(300, 300);
		ff.setLayout(null);
		
		Canvas cc = new Canvas();
		
		cc.setBackground(new Color(255,100,0));
		cc.setBounds(100, 100, 150, 100);
		
		Canvas cc2 = new Canvas();
		
		cc2.setBackground(new Color(0,100,255));
		cc2.setBounds(120,150,150,100);
		
		ff.add(cc2);
		ff.add(cc);
		
		ff.setVisible(true);
		
		
	}
}
