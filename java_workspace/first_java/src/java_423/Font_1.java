package java_423;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Font_1 {
	public static void main(String[] args) {
		
		XCanvas canvas = new XCanvas();
		Frame f = new Frame(" 폰트 예제 3");
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		
		});
		f.add(canvas);
		f.setSize(250, 250);
		f.setVisible(true);
	}
}


class XCanvas extends Canvas{
	
	Font font = new Font("Timesroman", Font.ITALIC, 30);
	String str = "빨주노초파남보";
	Color color[] = {Color.red,Color.orange,Color.yellow, Color.green, Color.blue, Color.magenta, Color.cyan};
	
	@Override
	public void paint(Graphics g) {
		g.setFont(font);
		
		for (int i = 0; i < 7; i++) {
			g.setColor(Color.gray);
			g.drawString(str.charAt(i) + " ", (i * 30 + 5), 105);
			g.setColor(color[i]);
			g.drawString(str.charAt(i) + " ", i * 30, 100);
		}
	}
}