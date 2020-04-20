package event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.Provider.Service;

public class ActionEvent_1 extends Frame implements ActionListener{

	Panel panel;
	Button btn1, btn2;
	TextArea txt;
	
	public ActionEvent_1(String str) {
		super(str);
		
		txt = new TextArea("��ư�� �����ּ���");
		btn1 = new Button("�� ��ư");
		btn2 = new Button("�� ��ư");
		panel = new Panel();
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		panel.add(btn1);
		panel.add(btn2);
		
		add("South", panel);
		add("North",txt);
		
		setSize(300,300);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new ActionEvent_1("Action Event practice");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		
		if (obj == btn1) {
			txt.setText("����ư�� �������ϴ�.");
		}
		else {
			txt.setText("����ư�� �������ϴ�.");
		}
		
	}

}
