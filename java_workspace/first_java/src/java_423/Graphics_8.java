package java_423;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Graphics_8 extends Frame implements MouseMotionListener {

	int x = 0;
	int y = 0;

	Image img = null;
	Graphics gImg = null;

	public Graphics_8(String title) {
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

		img = createImage(500, 500);
		gImg = img.getGraphics();
		gImg.drawString("왼쪽 버튼을 누른 채로 마우스를 움직임", 15, 50);
		repaint();
	}


	@Override
	public void paint(Graphics g) {
		if (img == null) 
			return;
		g.drawImage(img,0,0,this); // 가상 화면에 그려진 그림을 Frame에 복사
	}
	
	public static void main(String[] args) {
		new Graphics_8("Graphics Test~~");
	}
	
	@Override
	public void mouseDragged(MouseEvent me) {
			if (me.getModifiersEx() != MouseEvent.BUTTON1_DOWN_MASK) 
				return;
			gImg.drawLine(x, y, me.getX(), me.getY());
			x = me.getX();
			y = me.getY();
	
			repaint();
	}
	
	@Override
	public void mouseMoved(MouseEvent me) {
		/*
		 * if (me.getModifiersEx() != MouseEvent.BUTTON2_DOWN_MASK) 
		 */
		x = me.getX();
		y = me.getY();
		gImg.clearRect(x, y, 30, 30);
		
		repaint();
	}

}
