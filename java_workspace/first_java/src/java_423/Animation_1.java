package java_423;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Animation_1 extends Frame{
	Image[] img = new Image[8];
	int num1 = 0;
	int num2 = 0;
	boolean flag =false;
	int xsize =0;
	int ysize =0;

	public Animation_1(String title) {
		super(title);

		for (int i = 0; i < 8; i++) {
			img[i] = Toolkit.getDefaultToolkit().getImage("bttrfly" + (i+1) + ".jpg");
		}

		addWindowListener(new WindowHandler());
		setSize(250, 250);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {

		if (num1 > 7) {
			num1 = 0;
			num2 = 0;
		}
		
		if (!flag) {
			if (xsize > 300) {
				flag = !flag;
			}
			xsize +=3 ;
			ysize +=3 ;
			g.drawImage(img[num1++], xsize, 100, this);
			g.drawImage(img[num2++], 100, ysize, this);
			
		}
		else
		{
			if (xsize <= 0) {
				flag = !flag;
			}
			xsize -= 3;
			ysize -= 3;
			g.drawImage(img[num1++], xsize, 100, this);
			g.drawImage(img[num2++], 100, ysize, this);
		}
	}

	class WindowHandler extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	public static void main(String[] args) {

		Animation_1 ani = new Animation_1("fly~~~");
		while (true) {
			try {
				Thread.sleep(100);
				ani.repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}
}

