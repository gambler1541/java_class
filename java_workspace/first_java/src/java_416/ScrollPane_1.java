package java_416;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextArea;

public class ScrollPane_1 extends Frame{
	
	public ScrollPane_1(String title) {

		super(title);
		
		ScrollPane srp = new ScrollPane();
		
		srp.setSize(220, 200);
		
		Panel panel = new Panel();
		panel.setLayout(new BorderLayout());
		
		TextArea txt = new TextArea("�ؽ�Ʈ �����");
		txt.setBackground(new Color(100,0,255));
		txt.setForeground(new Color(255,0,100));
		
		Panel panel2 = new Panel();
		panel2.setLayout(new BorderLayout());
		
		TextArea txt2 = new TextArea("�ؽ�Ʈ �����");
		txt2.setBackground(new Color(0,180,255));
		txt2.setForeground(new Color(255,180,0));
		
		
		panel.add("North", new Button("��ư"));
		panel.add("Center",txt2);
		panel.add("South", new Button("Ȯ��"));
		
		panel2.add("North", new Button("��ư"));
		panel2.add("Center", new TextArea("���°���")).setBackground(new Color(200,80,90));
		panel2.add("South", new Button("Ȯ��"));
		
		
		// ��ũ���� ���
		// ���� ȭ�鿡 ��� ǥ�� �����ϴٸ� ��ũ���� �����
		// ScrollPane�� ������Ʈ �Ѱ��� �ø�������
		// �ΰ����ø��� ó���ø� ������Ʈ�� �����
		srp.add(panel);	
//		srp.add(panel2);	
		
		
		add("Center", srp);
		
		setSize(200, 200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ScrollPane_1("ScrollPane Test~~~");
	}
}
