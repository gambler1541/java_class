package java_422;

import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;

public class Graphics_3 extends Frame{
	public Graphics_3(String title) {
		super(title);
		
		XCanvas grr = new XCanvas();
		
		grr.setSize(300, 300);
		add("Center", grr);
		
		setSize(350, 350);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Graphics_3("Graphics Test");
	}
}

class XCanvas extends Canvas{
	
	int[] point_x1 = {10, 20, 50, 10, 100};
	int[] point_y1 = {20, 70, 100, 150, 100};

	int[] point_x2 = {100, 10,100, 190};
	int[] point_y2 = {110, 200,290,200};
	
	
	@Override
	public void paint(Graphics g) {
		g.drawPolygon(point_x1, point_y1, 5);
		g.fillPolygon(point_x2, point_y2, 4);
	}
}