package java_421;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class Component_1 extends Frame implements ActionListener, ComponentListener {
	TextArea txt;
	Button btn;
	
	public Component_1(String title) {
		super(title);
		
		btn = new Button("ȭ�鿡�� ��� �����~");
		btn.addActionListener(this);
		
		add("South", btn);
		
		txt = new TextArea();
		add("Center", txt);
		addComponentListener(this);
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Component_1("Component Test~~");
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try { 
			// this.hide();
			this.setVisible(false); // ȭ�鿡�� �����
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		this.setVisible(true);
	}
	
	@Override
	public void componentResized(ComponentEvent e) {
		txt.append("������Ʈ ũ�� ���� ~~~ \n");
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		txt.append("������Ʈ �̵��� ���� %%%% \n");
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		txt.append("������Ʈ�� ȭ�鿡 ��Ÿ�� ^^^^^^^^\n");
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		txt.append(" ������Ʈ�� ������ ~~!~~~~~~ \n");
	}


}
