package java_422;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEvent_1 extends Frame implements MouseListener{
	
	public MouseEvent_1(String str) {
		super(str);
		
		addMouseListener(this);
		
		setSize(300, 300);
		setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new MouseEvent_1("Mouse Event Test");
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("마우스 버튼을 클릭클릭");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("마우스 버튼을 누르르르름");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("마우스 버튼을 놓았음");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("마우스가 프레임안에 들어옴~~");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("마우스가 프레임에서 벗어남~~");
	}

}
