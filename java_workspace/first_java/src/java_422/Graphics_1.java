package java_422;

import java.awt.Frame;
import java.awt.Graphics;

public class Graphics_1 extends Frame{
	public Graphics_1(String str) {
		super(str);
		
		setSize(300, 250);
		setVisible(true);
		
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawLine(10, 10, 190, 190);
		g.fillRect(10, 30, 100, 100);
		g.fillOval(50, 50, 100, 100);
		g.fillArc(100, 100, 80, 80, 0, 180);
	}
	
	public static void main(String[] args) {
		new Graphics_1("Graphics Test");
	}	
}
