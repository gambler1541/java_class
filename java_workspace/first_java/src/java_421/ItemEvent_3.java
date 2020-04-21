package java_421;

import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEvent_3 extends Frame implements ItemListener{
	
	List lst_1, lst_2;
	Label lbl_info;
	int j = 0;
	
	String[] 대륙 = {"아시아", "유럽", "아프리카"};
	String[][] 나라 = {
		{"한국","중국","필리핀"},
		{"스위스","영국","프랑스"},
		{"이집트","콩고","우간다"}
		};
	
	public ItemEvent_3(String str) {
		super(str);
		Label lbl = new Label("대륙과 나라를 선택하세요");
		Panel panel = new Panel();
		
		lbl_info = new Label();
		lst_1 = new List(2, false);
		lst_2 = new List(2, false);
		
		lst_1.addItemListener(this);
		lst_2.addItemListener(this);
		
		for (int i = 0; i < 대륙.length; i++) {
			lst_1.add(대륙[i]);
			lst_2.add("    ");
			panel.add(lst_1); panel.add(lst_2);
			
			add("North", lbl);
			add("Center", panel);
			add("South", lbl_info);
			
			setSize(400, 200);
			setVisible(true);
			
			
		}
	}
	public static void main(String[] args) {
		new ItemEvent_3("Item Event Test~");
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		List obj = (List)e.getSource();
		String str = "선택한 대륙과 나라는 : ";
		
		if (obj == lst_1) {
			lst_2.removeAll();
			int j = lst_1.getSelectedIndex();		// lst_1의 인덱스를 j에 추가(아시아 = 0 , 유럽 = 1, 아프리카 = 2)
			for (int i = 0; i < 나라[j].length; i++) {	// 만약 아시아를 골랐다면 나라[0]번째의 길이만큼 for문이 실행됨
				lst_2.add(나라[j][i]);					// 나라(아시아)[0][0~2]의 txt를 lst2에 추가
			}
		}
		else {
			str += lst_1.getSelectedItem();
			str += " - " + lst_2.getSelectedItem();
			lbl_info.setText(str);
		}
	}
}
