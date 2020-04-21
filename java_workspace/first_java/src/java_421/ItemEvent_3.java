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
	
	String[] ��� = {"�ƽþ�", "����", "������ī"};
	String[][] ���� = {
		{"�ѱ�","�߱�","�ʸ���"},
		{"������","����","������"},
		{"����Ʈ","���","�찣��"}
		};
	
	public ItemEvent_3(String str) {
		super(str);
		Label lbl = new Label("����� ���� �����ϼ���");
		Panel panel = new Panel();
		
		lbl_info = new Label();
		lst_1 = new List(2, false);
		lst_2 = new List(2, false);
		
		lst_1.addItemListener(this);
		lst_2.addItemListener(this);
		
		for (int i = 0; i < ���.length; i++) {
			lst_1.add(���[i]);
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
		String str = "������ ����� ����� : ";
		
		if (obj == lst_1) {
			lst_2.removeAll();
			int j = lst_1.getSelectedIndex();		// lst_1�� �ε����� j�� �߰�(�ƽþ� = 0 , ���� = 1, ������ī = 2)
			for (int i = 0; i < ����[j].length; i++) {	// ���� �ƽþƸ� ����ٸ� ����[0]��°�� ���̸�ŭ for���� �����
				lst_2.add(����[j][i]);					// ����(�ƽþ�)[0][0~2]�� txt�� lst2�� �߰�
			}
		}
		else {
			str += lst_1.getSelectedItem();
			str += " - " + lst_2.getSelectedItem();
			lbl_info.setText(str);
		}
	}
}
