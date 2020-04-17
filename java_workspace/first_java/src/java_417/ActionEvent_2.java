package java_417;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_2 extends Frame implements ActionListener{
	
	TextArea txt_info;
	Button btn1, btn2;
	
	public ActionEvent_2(String title) {
		super(title);
		
		txt_info = new TextArea(" -- 버튼을 눌러 주세요 __ \n");
		btn1 = new Button("◀ 버튼");
		btn2 = new Button("▶ 버튼");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		Panel panel = new Panel();
		
		panel.add(btn1);
		panel.add(btn2);
		
		add("Center", txt_info);
		add("South", panel);
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ActionEvent_2("Test~");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		txt_info.append(e.getActionCommand() + "눌렸습니다. \n");
		System.out.println(e.getActionCommand() + "눌렸습니다. \n");
	}
}
