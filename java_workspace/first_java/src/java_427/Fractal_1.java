package java_427;



import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Fractal_1 extends JFrame{

	public Fractal_1() {
		setSize(800, 700);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	int aa1 = 0;
	
	private void drawTree(Graphics g, int x1, int y1, double angle, int depth) {
		if (depth ==0) 
			return;
		
		int xx1 = (int) (Math.random() * 25 + 1);
		int yy1 = (int) (Math.random() * 25 + 1);
		// aa1 = (int)(math.random() *180 +1);
		
		int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * xx1);
		int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * yy1);
	
		g.drawLine(x1, y1, x2, y2);
		
		drawTree(g, x2, y2, angle - 20, depth - 1);
		drawTree(g, x2, y2, angle + 20, depth - 1);
		drawTree(g, x2, y2, angle + 20, depth - 1);
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(new Color((int)(Math.random()*256),
				(int)(Math.random()*256),
				(int)(Math.random()*256)
				));
		drawTree(g, 500, 600, -90, 10);
	}
	
	public static void main(String[] args) {
		new Fractal_1();
	}
}
