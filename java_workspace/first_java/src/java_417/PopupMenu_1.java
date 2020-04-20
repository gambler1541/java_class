package java_417;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PopupMenu_1 extends Frame implements MouseListener{
	
	PopupMenu popup;
	TextArea txt;
	
	public PopupMenu_1(String title) {
		super(title);
		
		popup = new PopupMenu("���� �˾� �޴�");
		txt = new TextArea("�ڸ�� ~~~�ڸ��");
		
		MenuItem cut = new MenuItem("�����α�");
		MenuItem paste = new MenuItem("���̱�");
		MenuItem copy = new MenuItem("�����ϱ�");
		
		
		popup.add(cut);
		popup.add(paste);
		popup.add(copy);
		
		
		txt.addMouseListener(this);
		txt.add(popup);
		
		add(txt);
		setSize(300,300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		
		new PopupMenu_1("Popup Menu~~~");
		
		
	}
	
	
	// Clicked, pressed, released�� �� �� �ϳ��� �ۼ��ص� �Ȱ��� ���� 
	@Override
	public void mouseClicked(MouseEvent e) {	// ������ ��������
	
	}

	@Override
	public void mousePressed(MouseEvent e) {	// ���콺 ������
		popup.show(txt, e.getX(), e.getY());
//		System.out.println(" "+ txt + " : " + e.getX() + ","+e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {	// ���콺 ������ ����

		
	}

	@Override
	public void mouseEntered(MouseEvent e) {	// ���콺�� ������Ʈ�� ������
		
	}

	@Override
	public void mouseExited(MouseEvent e) {		// ������Ʈ���� ��������
		
	}
	
}
