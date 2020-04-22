package java_422;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotionEvent_1 extends Frame implements MouseMotionListener {
	
	Label info;
	
	public MouseMotionEvent_1(String str) {
		super(str);
		
		info = new Label();
		
		add("North", info);
		addMouseMotionListener(this);
		
		setSize(300, 300);
		setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new MouseMotionEvent_1("Mouse Motion event Test~~");
	}
	
	
	@Override
	public void mouseDragged(MouseEvent e) {
		info.setText("마우스 드래그~");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		info.setText(" X = " + e.getX() + " XX = " + e.getXOnScreen() + ", Y = " + e.getY()); // getXOnScreen = 모니터 상 좌표
	}
	
}
