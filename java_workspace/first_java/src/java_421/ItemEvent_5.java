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
	
	String[] os_str= {"윈도우 98", "리눅스", "윈도우10", "MS_DOS", "윈도우 XP"};
	String[] cpu_str = {"AMD", "인텔", "사이릭스"};
	String[] flower_str = {"개나리", "민들레","수선화","목련","라일락"};
	int i;
	
	
	public ItemEvent_5(String title) {
		super(title);
	
		Label lbl = new Label("설치된 운영체제와 CPU를 선택하시오");
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
		
		
		String msg = "당신의 컴퓨터 OS는 ";
		
		for (int i = 0; i < os.length; i++) {
			if (os[i].getState()) {					// getState() => Check가 됐다면 True, 아니라면 False
				msg += "[" + os[i].getLabel() + "]";
			}
		}

		for (int i = 0; i < cpu.length; i++) {
			if (cpu[i].getState()) {
				msg += ", CPU : " + cpu[i].getLabel() + " 입니다 그리고";
			}
		}
		for (int i = 0; i < flower.length; i++) {
			if (flower[i].getState()) {
				msg += "좋아하는 꽃은 " + flower[i].getLabel() + "입니다.";
			}
		}
		
		
		
		
		lbl_info.setText(msg);
	}

}
