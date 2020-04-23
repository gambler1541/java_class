package java_422;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Graphics_5 extends Frame implements MouseMotionListener{
	
	int x = 0;
	int y = 0;
	
	public Graphics_5(String title) {
		super(title);
		addMouseMotionListener(this);
		
		addWindowListener(new WindowAdapter() {
		
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setBounds(100, 100, 500, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Graphics_5("Graphics_5 Test~~");
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
		g.drawString("마우스를 움직이세요 !" , 20, 50);
		g.drawString("●", x, y);
	}
	
	@Override
	public void update(Graphics g) {
		paint(g);
	}
	@Override
	public void mouseDragged(MouseEvent me) {
		
	}

	@Override
	public void mouseMoved(MouseEvent me) {
		x = me.getX();
		y = me.getY();
		repaint();
	}
	
}
