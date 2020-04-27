package java_427;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Shotting_1 extends JFrame{

	public Shotting_1() {
		setTitle("My Game");
		add(new MyPanel1());
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Shotting_1();
	}
}

class GraphicObject{
	BufferedImage img = null;
	int x = 0;
	int y = 0;

	public GraphicObject(String name) {
		try {
			img = ImageIO.read(new File(name));
		}catch (IOException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}

	public void update() {

	}

	public void draw(Graphics g) {
		g.drawImage(img, x, y, null);
	}

	public void keyPressed(KeyEvent evnet) {

	}
}

class Missile_1 extends GraphicObject{
	boolean launched = false;

	public Missile_1(String name) {
		super(name);

		y = -200;
	}

	public void update() {
		if (launched) 
			y -= 3;
		if (y < -100) 
			launched = false;
	}

	public void keyPressed(KeyEvent event, int x, int y) {
		if (event.getKeyCode() == KeyEvent.VK_SPACE) {
			launched = true;
			this.x = x;
			this.y = y;
		}
	}
}

class Enemy_1 extends GraphicObject{ 
	int dx = -10;

	public Enemy_1(String name) {

		super(name);
		x = 500;
		y = 0;
	}

	public void update( ) { 
		x += dx;
		if (x < 0) 
			dx = +10;
		if (x > 500) 
			dx = -10;
	}
}

class SpaceShip extends GraphicObject{
	public SpaceShip(String name) {
		super(name);

		x = 150;
		y = 350;
	}
	public void keyPressed(KeyEvent event) {
		if (event.getKeyCode() == KeyEvent.VK_LEFT) {
			x -= 10;
		}

		if (event.getKeyCode() == KeyEvent.VK_RIGHT) {
			x += 10;
		}
		
		if (event.getKeyCode() == KeyEvent.VK_UP) {
			y -= 10;
		}
		
		if (event.getKeyCode() == KeyEvent.VK_DOWN) {
			y += 10;
		}
		
	}
}
class MyPanel1 extends JPanel implements KeyListener {
	
	Enemy_1 enemy;
	SpaceShip spaceship;
	Missile_1 missile;
	
	public MyPanel1() {
		super();
		this.addKeyListener(this);
		this.requestFocus();
		setFocusable(true);
		
		enemy = new Enemy_1("missile_4.jpg");
		spaceship = new SpaceShip("missile_5.jpg");
		missile = new Missile_1("missile_3.jpg");
		class MyThread extends Thread {
			@Override
			public void run() {
				while (true) {
					
					enemy.update();
					spaceship.update();
					missile.update();
					repaint();
					try {
						Thread.sleep(50);
					}catch (InterruptedException e) {
					}
				}
			}
		}
		Thread t = new MyThread();
		t.start();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		enemy.draw(g);
		spaceship.draw(g);
		missile.draw(g);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent event) {
		spaceship.keyPressed(event);
		missile.keyPressed(event, spaceship.x, spaceship.y);
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
}