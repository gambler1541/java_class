package java_420;

import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PactionEvent_5 extends Frame implements ActionListener{
	
	List list;
	Panel panel;
	TextArea txt;
	
	public PactionEvent_5(String str) {
		super(str);
		
		list = new List(5, true);
		panel = new Panel();
		
		list.add("����");
		list.add("����");
		list.add("�뱸");
		list.add("�λ�");
		list.add("���");
		list.add("���ֵ�");
		list.add("����");

		
		panel.add(list);
		txt = new TextArea("~  ");
		
		list.addActionListener(this);
		
		add("North", panel);
		add("South",txt);
		
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PactionEvent_5("Test~");
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String[] str = list.getSelectedItems();
		for (int i = 0; i < str.length; i++) {
			txt.append(str[i]);
		}
	}
	
}
