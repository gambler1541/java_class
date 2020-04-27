package java_427;

import java.awt.Graphics;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyCarTest extends JFrame {

	public MyCarTest() {
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanel());
		setVisible(true);
	}

	public static void main(String[] args) {
		MyCarTest s = new MyCarTest();
	}
}


class MyPanel extends JPanel{

	BufferedImage img = null;
	int img_x = 100, img_y =100;

	public MyPanel() {
		try {
			img = ImageIO.read(new File("car_2.jpg"));
		}catch (IOException e) {
			System.out.println("No Image");
			System.exit(1);
		}
		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent arg0) {
			}

			@Override
			public void keyReleased(KeyEvent arg0) {

			}

			@Override
			public void keyPressed(KeyEvent e) {
				int keycode = e.getKeyCode();
				switch (keycode) {
				case KeyEvent.VK_UP:
					img_y -= 10;
					break;
				case KeyEvent.VK_DOWN:
					img_y += 10;
					break;
				case KeyEvent.VK_LEFT:
					img_x -= 10;
					break;
				case KeyEvent.VK_RIGHT:
					img_x += 10;
					break;
				case KeyEvent.VK_1:	
					img_y -= 10;
					img_x -= 10;
					break;
				case KeyEvent.VK_2:	
					img_y -= 10;
					img_x += 10;
					break;
				case KeyEvent.VK_3:	
					img_y += 10;
					img_x -= 10;
					break;
				case KeyEvent.VK_4:	
					img_y += 10;
					img_x += 10;
					break;
				}
				repaint();
			}
		});
		this.requestFocus();
		setFocusable(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, img_x, img_y, null);
	}
}