package java_417;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_3 extends Frame implements ActionListener{

	Label lbl_info;
	Button[] btn = new Button[10];
	Color myc1 = new Color(0,100,255);
	Color myc2 = new Color(100,0,255);
	Color myc3 = new Color(255,0,100);
	Color[] color = {Color.red, Color.orange, Color.yellow, Color.green
			,Color.magenta, Color.cyan, Color.gray,myc1,myc2,myc3};
	
	String[] string = {"Red","Orange","Yellow","Green"
			,"Magenta","Cyan","Gray","myc1","myc2","myc3"};

	public ActionEvent_3(String title) {
		super(title);

		setLayout(new FlowLayout());

		for (int i = 0; i < color.length; i++) {
			btn[i] = new Button(string[i]);
			btn[i].setForeground(color[i]);
			btn[i].addActionListener(this);
			add(btn[i]);
		}
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ActionEvent_3("ActionEvent Test~~~");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();

		for (int i = 0; i < 10; i++) {
			if (obj == btn[i]) {
				this.setBackground(color[i]);
			}
		}
		System.out.println(e.getActionCommand() + "´­·È½À´Ï´Ù. \n");
	}
}		
