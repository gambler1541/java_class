package java_417;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Handler;

public class ActionEvent_1 extends Frame implements ActionListener{
	
	Label lbl_info;
	Button btn1, btn2, btn3;
	
	public ActionEvent_1(String title) {
		super(title);
		
		lbl_info = new Label("��ư�� ���� �ּ��� !!");
		btn1 = new Button("�� ��ư");
		btn2 = new Button("�� ��ư");
		btn3 = new Button("�ܹ�ư");	
		
		btn1.addActionListener(this);			// Button�� listener�� ���(This => �ڱ� �ڽſ��� ã��)
		btn2.addActionListener(this);			// new Handler => �� HandlerŬ������ �����ؼ� ���
		btn3.addActionListener(this);
		Panel panel = new Panel();		
		
		panel.add(btn1);
		panel.add(btn3);
		panel.add(btn2);
		
		
		add("Center", panel);
		add("South", lbl_info);
		
		setSize(300, 300);
		setVisible(true);
	}
	
//	class Handler implements ActionListener{
//
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			Object obj = e.getSource();
//			
//			if ((Button)obj == btn1) {
//				lbl_info.setText("���� ��ư�� ���Ƚ��ϴ�.");
//			}
//			else if ((Button)obj == btn2) {
//				lbl_info.setText("������ ��ư�� ���Ƚ��ϴ�.");
//			}
//			else {
//				lbl_info.setText("��� ��ư�� ���Ƚ��ϴ�.");
//			}
//			
//		}
//		
//		
//		
//	}
	
	public static void main(String[] args) {
		new ActionEvent_1("ActionEvent Test~~~");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if ((Button)obj == btn1) {
			lbl_info.setText("���� ��ư�� ���Ƚ��ϴ�.");
			System.out.println("���� ��ư�� ���Ƚ��ϴ�.");
		}
		else if ((Button)obj == btn2) {
			lbl_info.setText("������ ��ư�� ���Ƚ��ϴ�.");
			System.out.println("������ ��ư�� ���Ƚ��ϴ�.");
		}
		else {
			lbl_info.setText("��� ��ư�� ���Ƚ��ϴ�.");
			System.out.println("��� ��ư�� ���Ƚ��ϴ�.");
		}
	}

}
