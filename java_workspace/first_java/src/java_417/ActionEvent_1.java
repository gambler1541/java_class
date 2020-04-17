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
		
		lbl_info = new Label("버튼을 눌러 주세요 !!");
		btn1 = new Button("◀ 버튼");
		btn2 = new Button("▶ 버튼");
		btn3 = new Button("●버튼");	
		
		btn1.addActionListener(this);			// Button에 listener를 사용(This => 자기 자신에서 찾음)
		btn2.addActionListener(this);			// new Handler => 새 Handler클래스를 생성해서 사용
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
//				lbl_info.setText("왼쪽 버튼이 눌렸습니다.");
//			}
//			else if ((Button)obj == btn2) {
//				lbl_info.setText("오른쪽 버튼이 눌렸습니다.");
//			}
//			else {
//				lbl_info.setText("가운데 버튼이 눌렸습니다.");
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
			lbl_info.setText("왼쪽 버튼이 눌렸습니다.");
			System.out.println("왼쪽 버튼이 눌렸습니다.");
		}
		else if ((Button)obj == btn2) {
			lbl_info.setText("오른쪽 버튼이 눌렸습니다.");
			System.out.println("오른쪽 버튼이 눌렸습니다.");
		}
		else {
			lbl_info.setText("가운데 버튼이 눌렸습니다.");
			System.out.println("가운데 버튼이 눌렸습니다.");
		}
	}

}
