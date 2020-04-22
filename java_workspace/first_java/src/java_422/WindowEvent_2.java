package java_422;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEvent_2 extends Frame {

	public WindowEvent_2(String str) {
		super(str);
		
		addWindowListener(new Handler());
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowEvent_2("Window Adapter~~");
	}
	
	
	class Handler extends WindowAdapter {
		
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("������ �ݱ�");
			System.exit(0);
		}
	}
//	class Handler implements WindowListener {		// WindowListener(�������̽�)�� ��ӹ���
//		@Override
//		public void windowClosing(WindowEvent e) {
//			System.out.println("������ �ݱ�");
//			System.exit(0);	//���α׷� ����
//		}
//
//		@Override
//		public void windowOpened(WindowEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void windowClosed(WindowEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void windowIconified(WindowEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void windowDeiconified(WindowEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void windowActivated(WindowEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void windowDeactivated(WindowEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//	}


	
	
}
