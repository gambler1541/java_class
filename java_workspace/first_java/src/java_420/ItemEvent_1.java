package java_420;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEvent_1 extends Frame implements ItemListener{
	
	Checkbox ckb1, ckb2, ckb3, ckb4;
	TextArea txt_info;
	
	public ItemEvent_1(String title) {
		super(title);
		
		txt_info = new TextArea();
		Label lbl = new Label("좋아하는 계절을 선택하시오 ? ");
		Panel panel = new Panel();
		
		ckb1 = new Checkbox("봄");
		ckb2 = new Checkbox("여름");
		ckb3 = new Checkbox("가을");
		ckb4 = new Checkbox("겨울");
		
		
		ckb1.addItemListener(this);
		ckb2.addItemListener(this);
		ckb3.addItemListener(this);
		ckb4.addItemListener(this);
		
		panel.add(ckb1);
		panel.add(ckb2);
		panel.add(ckb3);
		panel.add(ckb4);
	
		add("North", lbl);
		add("Center", txt_info);
		add("South", panel);
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ItemEvent_1("ItemEvent Test~~");
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		txt_info.setText("");
		if (ckb1.getState()) {
			txt_info.append("봄을 좋아하시네요. \n");
		}
		
		if (ckb2.getState()) {
			txt_info.append("여름을 좋아하시네요. \n");
		}
		if (ckb3.getState()) {
			txt_info.append("가을을 좋아하시네요. \n");
		}
		
		if (ckb4.getState()) {
			txt_info.append("겨울을 좋아하시네요. \n");
		}
		
	}

}
