package java_414;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class Frame_3 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("�߾� �迭");
		
		ff.setSize(400, 300);
		
		Toolkit ttk = Toolkit.getDefaultToolkit();
		// ������ toolkit ��ü�� ��´�
		
		Dimension screenSize = ttk.getScreenSize();
		// ȭ���� ũ�⸦ ���Ѵ�.
		
		ff.setLocation(screenSize.width / 2 - 200, screenSize.height / 2 - 150);
		
		ff.setVisible(true);
		
		
	}
}
