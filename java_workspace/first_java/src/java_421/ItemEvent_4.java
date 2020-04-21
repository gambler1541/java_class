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

	String[] ��� = { "�ƽþ�", "����", "������ī" };
	String[][] ���� = { { "�ѱ�", "�Ϻ�", "�߱�" }, { "����", "������", "������" }, { "����Ʈ", "���", "�찣��" } };
	String[][] ���� = { { "����", "����", "����¡" }, { "����", "����", "�ĸ�" }, { "ī�̷�", "����ں�", "į�ȶ�" } };
		  
	public ItemEvent_4(String str) {
		super(str);

		Label lbl = new Label("����� ���� �����ϼ��� ");
		Panel panel = new Panel();

		lbl_info = new Label();
		lst_1 = new Choice();
		lst_2 = new Choice();
		lst_3 = new Choice();

		lst_1.addItemListener(this);
		lst_2.addItemListener(this);
		lst_3.addItemListener(this);

		for (int i = 0; i < ���.length; i++) {
			lst_1.add(���[i]);
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
		String str = "������ ����� ������ ������ : ";
		

		if (obj == lst_1) {
			int j = lst_1.getSelectedIndex();
			lst_2.removeAll();
			lst_3.removeAll();
			for (int i = 0; i < ����[j].length; i++) {
				lst_2.add(����[j][i]);
			}
		}
		else if (obj == lst_2) {
			int k = lst_1.getSelectedIndex();
			lst_3.removeAll();
			for (int i = 0; i < ����[k].length; i++) {
				lst_3.add(����[k][i]);
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
