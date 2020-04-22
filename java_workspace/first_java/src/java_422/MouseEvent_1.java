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
		System.out.println("���콺 ��ư�� Ŭ��Ŭ��");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("���콺 ��ư�� ����������");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("���콺 ��ư�� ������");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("���콺�� �����Ӿȿ� ����~~");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("���콺�� �����ӿ��� ���~~");
	}

}
