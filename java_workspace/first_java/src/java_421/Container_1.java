package java_421;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

public class Container_1 extends Frame implements ContainerListener, ActionListener{
	
	Panel panel;
	Button btn, btn_s1, btn_s2;
	
	public Container_1(String str) {
		super(str);
		
		panel = new Panel(	);
		panel.setSize(200, 200);
		add("Center", panel);
		
		panel.addContainerListener(this);
		
		btn = new Button("������Ʈ �߰�!");
		btn.addActionListener(this);
		add("South", btn);
		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Container_1("Container Event test~~");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Button obj = (Button) e.getSource();
				
		if (e.getActionCommand().equals("������Ʈ �߰�!")) {
			panel.add(btn_s1 = new Button("������Ʈ �߰�!"));
			
			setVisible(true);
			btn.setLabel("������Ʈ ����!");
		}
		else {
			// panel.remove(btn_s1);
			// panel.remove(btn_s2);
			panel.removeAll();
			btn.setLabel("������Ʈ �߰�!");
		}
	}

	@Override
	public void componentAdded(ContainerEvent e) {
		setTitle("�����̳ʿ� ������Ʈ �߰�!!");
	}

	@Override
	public void componentRemoved(ContainerEvent e) {
		setTitle("�����̳ʿ� ������Ʈ ����!!");
	}

}
