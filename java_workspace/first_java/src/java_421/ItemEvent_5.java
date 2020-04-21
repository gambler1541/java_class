package java_421;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ItemEvent_5 extends Frame implements ItemListener{
	
	Checkbox[] os = new Checkbox[5];
	Checkbox[] cpu = new Checkbox[3];
	Checkbox[] flower = new Checkbox[5];
	
	CheckboxGroup cbg;
	
	Label lbl_info;
	
	String[] os_str= {"������ 98", "������", "������10", "MS_DOS", "������ XP"};
	String[] cpu_str = {"AMD", "����", "���̸���"};
	String[] flower_str = {"������", "�ε鷹","����ȭ","���","���϶�"};
	int i;
	
	
	public ItemEvent_5(String title) {
		super(title);
	
		Label lbl = new Label("��ġ�� �ü���� CPU�� �����Ͻÿ�");
		lbl_info = new Label();
		
		Panel panel1 = new Panel();
		Panel panel2 = new Panel();
		Panel panel3 = new Panel();
		Panel panel4 = new Panel();
		
		for (int i = 0; i < os.length; i++) {
			
			os[i] = new Checkbox(os_str[i]);
			panel1.add(os[i]);
			os[i].addItemListener(this);
		}
		
		cbg = new CheckboxGroup();
		for (int i = 0; i < cpu.length; i++) {
			cpu[i] = new Checkbox(cpu_str[i] , cbg , (i == 2) ? true: false);
			panel2.add(cpu[i]);
			cpu[i].addItemListener(this);
		}
		
		
		for (int j = 0; j < flower.length; j++) {
			flower[j] = new Checkbox(flower_str[j]);
			panel3.add(flower[j]);
			flower[j].addItemListener(this);
		}
		
		
		
		panel4.setLayout(new BorderLayout());
		panel4.add("North",panel1);
		panel4.add("Center",panel2);
		panel4.add("South",panel3);
		
		
		add("North", lbl);
		add("South", lbl_info);
		add("Center",panel4);
		
		setSize(400,250);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new ItemEvent_5("Item Event ( Check Box) Test~~"); 
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		
		String msg = "����� ��ǻ�� OS�� ";
		
		for (int i = 0; i < os.length; i++) {
			if (os[i].getState()) {					// getState() => Check�� �ƴٸ� True, �ƴ϶�� False
				msg += "[" + os[i].getLabel() + "]";
			}
		}

		for (int i = 0; i < cpu.length; i++) {
			if (cpu[i].getState()) {
				msg += ", CPU : " + cpu[i].getLabel() + " �Դϴ� �׸���";
			}
		}
		for (int i = 0; i < flower.length; i++) {
			if (flower[i].getState()) {
				msg += "�����ϴ� ���� " + flower[i].getLabel() + "�Դϴ�.";
			}
		}
		
		
		
		
		lbl_info.setText(msg);
	}

}
