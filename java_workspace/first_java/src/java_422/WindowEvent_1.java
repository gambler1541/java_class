package java_422;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEvent_1 extends Frame implements WindowListener {
	
	public WindowEvent_1(String str) {
		super(str);
		
		addWindowListener(this);
		setSize(300, 300);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new WindowEvent_1("Window Event Test~");
	}
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("������ ������");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("������ �ݱ�");
		this.dispose();// ���α׷� ����
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("������ ���� �ݱ�");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("������ ������ȭ");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("������ ������ȭ ����");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("������ Ȱ��ȭ");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("������ ��� ��Ȱ��ȭ");
	}

}
