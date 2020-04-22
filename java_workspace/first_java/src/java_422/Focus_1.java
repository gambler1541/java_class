package java_422;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Focus_1 extends Frame implements FocusListener {

	Button btn1, btn2;
	TextArea txt_info;
	
	public Focus_1(String str) {
		super(str);
		
		txt_info = new TextArea();
		btn1 = new Button("왼쪽 버튼");
		btn2 = new Button("오른쪽 버튼");
		
		btn1.addFocusListener(this);
		btn2.addFocusListener(this);
	
		Panel panel = new Panel();
		panel.add(btn1);
		panel.add(btn2);
		
		add("Center", txt_info);
		add("South", panel);
		
		setSize(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Focus_1("Focus Event~~");
	}
	
	@Override
	public void focusGained(FocusEvent e) {
		Button obj = (Button)e.getSource();
		
		if (obj == btn1) {
			txt_info.append(btn1.getLabel() + "포커스 얻음 \n");
		}
		else {
			txt_info.append(btn2.getLabel() + "포커스 얻음 \n");
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		Button obj = (Button)e.getSource();
		
		if (obj == btn1) {
			txt_info.append(btn1.getLabel() + "포커스 잃음!! \n");
		}
		else {
			txt_info.append(btn2.getLabel() + "포커스 잃음!! \n");
		}
	}
	
}
