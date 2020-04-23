package java_422;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Graphics_2 extends Frame {
	
	@Override
	public void paint(Graphics g) {
		
		g.setFont(new Font("Serif", Font.PLAIN, 17));
		g.drawString("Graphics를 이용해 그림을 그립니다.", 10, 50);
		
		g.drawOval(50, 100, 50, 50);
		
		g.setColor(Color.blue);
		g.fillOval(100,100, 50, 50);
		
		g.setColor(Color.red);
		g.drawLine(100, 100, 150, 150);
		
		g.fillRoundRect(200, 100, 120, 80, 30, 30);
		
		g.setColor(Color.orange);
		g.fillPolygon(new int[] {50, 100, 150, 200, 150, 100},
					  new int[] {250, 200, 200,250, 300, 300}, 6);
	
		g.setColor(Color.cyan);
		g.fillArc(250, 200, 100, 100, 0, 145);
		
		g.setColor(Color.black);
		g.fillArc(280, 270, 100, 100, 45, 270);
	}
	
	public Graphics_2(String title) {
		super(title);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		setBounds(100, 100, 400, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Graphics_2("Grapics Test~~");
	}
}
