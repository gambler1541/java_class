package java_427;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ball_1 extends JPanel{

	static final int BOARD_WIDTH = 600;
	static final int BOARD_HEIGTH = 300;
	private Ball ball = new Ball();
	private Ball2 ball2 = new Ball2();

	public Ball_1() {
		this.setBackground(Color.yellow);
		Runnable task = () -> {
			while(true) {
				ball.update();
				ball2.update();

				// ���ٽ��� �̿��Ͽ� Runnalble ��ü�� ����
				// ���ѷ����� ���鼭 ���� ��ġ�� �����ϰ� ȭ�鿡 �ٽ� �׸���
				// 50 �и��� ���� ����.

				repaint();
				try {
					Thread.sleep(50);
				}catch (InterruptedException ignore) {

				}
			}
		};
		new Thread(task).start();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		ball.draw(g);
		ball2.draw(g);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(Ball_1.BOARD_WIDTH, Ball_1.BOARD_HEIGTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(new Ball_1());
	}
}


class Ball {

	// ���� �Ӽ��� ��ġ, ũ�� ,�ӵ��̴�.

	private int x = 100;
	private int y = 100;
	private int size = 30;
	private int xSpeed = 10;
	private int ySpeed = 10;

	// ���� ȭ�鿡 �׷��ִ� �޼ҵ��̴�.

	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(x, y, size, size);
	}

	public void update() {
		x += xSpeed;
		y += ySpeed;

		if ((x + size) > Ball_1.BOARD_WIDTH - size || x < 0) {
			xSpeed = -xSpeed;
		}

		if ((y + size) > Ball_1.BOARD_HEIGTH - (size + 15) || y < 0) {
			ySpeed = -ySpeed;
		}
	}
}

class Ball2 {

	// ���� �Ӽ��� ��ġ, ũ�� ,�ӵ��̴�
	private int x = 250;
	private int y = 170;
	private int size = 20;
	private int xSpeed = 15;
	private int ySpeed = 8;

	// ���� ȭ�鿡 �׷��ִ� �޼ҵ��̴�.
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillOval(x, y, size, size);
	}

	public void update() {
		x += xSpeed;
		y += ySpeed;
		if ((x + size) > Ball_1.BOARD_WIDTH - size || x < 0) {
			xSpeed = -xSpeed;
		}
		
		if ((y + size) > Ball_1.BOARD_HEIGTH - size || y < 0) {
			ySpeed = -ySpeed;
		}

	}
}
