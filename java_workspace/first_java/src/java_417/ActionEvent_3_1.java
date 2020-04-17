package java_417;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_3_1 extends Frame{
	
	TextArea txt_info;
	Button btn1, btn2;
	
	public ActionEvent_3_1(String title) {
		super(title);
		
		txt_info = new TextArea(" -- 버튼을 눌러 주세요 __ \n");
		btn1 = new Button("◀ 버튼");
		btn2 = new Button("▶ 버튼");
		
		btn1.addActionListener(new Kbs(this));
		btn2.addActionListener(new Kbs(this));
		
		Panel panel = new Panel();
		
		panel.add(btn1);
		panel.add(btn2);
		
		add("Center", txt_info);
		add("South", panel);
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ActionEvent_3_1("Test~");
	}
	
	
	class Kbs implements ActionListener{
		
		ActionEvent_3_1 ttt;
		Kbs(ActionEvent_3_1 aaa) { 
			
			ttt = aaa;
			
		}
		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			txt_info.append(e.getActionCommand() + "눌렸습니다. \n");
			System.out.println(e.getActionCommand() + "눌렸습니다. \n");
		}
		
	}
	
}
