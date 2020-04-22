package java_422;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowEvent_3 extends Frame  {
	
	Frame[] win = new Frame[7];
	
	String[] str = {"����","��Ȳ","�Ķ�","���","�ʷ�","��ũ","����"};
	Color[] color = {Color.red, Color.orange, Color.blue, Color.yellow, Color.green, Color.pink, Color.black};
	
	public WindowEvent_3(String str) {
		super(str);
		
		for (int i = 0; i < 7; i++) {
			win[i] = new Frame();
			win[i].setBackground(color[i]);
			win[i].setLocation(i * 80 , i * 80);
			win[i].setSize(100, 100);
			win[i].addWindowListener(new WindowHandler());
			win[i].setVisible(true);
		}
	}

	class WindowHandler extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			String msg = "";
			Window obj = (Window) e.getSource();
			
			for (int i = 0; i < 7; i++) {
				if (obj == win[i]) {
					msg = str[i];
					win[i].dispose(); // ������ �����Ӹ� ����
				}
			}
			System.out.println("���� ������ �� : " + msg);
		}
		
		@Override
		public void windowIconified(WindowEvent e) {
			System.out.println("������ �ݱ� �ݱ�");
			System.exit(0);
		}
		
	}
	
	public static void main(String[] args) {
		new WindowEvent_3("Window Event3 Test~~");
	}
}
