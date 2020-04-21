package java_420;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PactionEvent_4 extends Frame implements ActionListener{
	
	TextField txt1,txt2,txt3;
	
	public PactionEvent_4(String str) {
		super(str);
		
		txt1 = new TextField("문자를 입력하세요",20);
		txt2 = new TextField("문자 입력",20);
		txt3 = new TextField("문자",20);
		
		txt1.addActionListener(this);
		txt2.addActionListener(this);
		txt3.addActionListener(this);
		
		add("North", txt1);
		add("Center", txt2);
		add("South", txt3);
		
		setSize(200, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PactionEvent_4("연습~~!~");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		TextField obj = (TextField)e.getSource();
		
		if (obj.equals(txt1)) {
			txt2.setText(obj.getText());
			txt3.setText(obj.getText());
			txt2.setFocusable(true);
			txt3.setFocusable(false);
			txt1.setFocusable(false);
		}
		else if (obj.equals(txt2)) {
			txt1.setText(obj.getText());
			txt3.setText(obj.getText());
			txt3.setFocusable(true);
			txt2.setFocusable(false);
			txt1.setFocusable(false);
		}
		else {
			txt1.setText(obj.getText());
			txt2.setText(obj.getText());
			txt1.setFocusable(true);
			txt2.setFocusable(false);
			txt3.setFocusable(false);
		}
	}

	
	
}
