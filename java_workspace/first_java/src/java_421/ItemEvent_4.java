package java_421;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEvent_4 extends Frame implements ItemListener {

	Choice lst_1, lst_2, lst_3;
	Label lbl_info;

	String[] 대륙 = { "아시아", "유럽", "아프리카" };
	String[][] 나라 = { { "한국", "일본", "중국" }, { "영국", "스위스", "프랑스" }, { "이집트", "콩고", "우간다" } };
	String[][] 수도 = { { "서울", "도쿄", "베이징" }, { "런던", "베른", "파리" }, { "카이로", "브라자빌", "캄팔라" } };
		  
	public ItemEvent_4(String str) {
		super(str);

		Label lbl = new Label("대륙과 나라를 선택하세요 ");
		Panel panel = new Panel();

		lbl_info = new Label();
		lst_1 = new Choice();
		lst_2 = new Choice();
		lst_3 = new Choice();

		lst_1.addItemListener(this);
		lst_2.addItemListener(this);
		lst_3.addItemListener(this);

		for (int i = 0; i < 대륙.length; i++) {
			lst_1.add(대륙[i]);
			lst_2.add("             ");
			lst_3.add("             ");
			panel.add(lst_1);
			panel.add(lst_2);
			panel.add(lst_3);

			add("North", lbl);
			add("Center", panel);
			add("South", lbl_info);

			setSize(350, 200);
			setVisible(true);

		}
	}

	public static void main(String[] args) {
		new ItemEvent_4("Choice Event Test~~");
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Choice obj = (Choice) e.getSource();
		String str = "선택한 대륙과 나라의 수도는 : ";
		

		if (obj == lst_1) {
			int j = lst_1.getSelectedIndex();
			lst_2.removeAll();
			lst_3.removeAll();
			for (int i = 0; i < 나라[j].length; i++) {
				lst_2.add(나라[j][i]);
			}
		}
		else if (obj == lst_2) {
			int k = lst_1.getSelectedIndex();
			lst_3.removeAll();
			for (int i = 0; i < 수도[k].length; i++) {
				lst_3.add(수도[k][i]);
			}
		}
		else {
			str += lst_1.getSelectedItem();
			str += " - " + lst_2.getSelectedItem();
			str += " - " + lst_3.getSelectedItem();
			lbl_info.setText(str);
		}
	}
}
