package java_414;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Checkbox_3 extends Frame{

	Checkbox os1, os2, os3;
	Checkbox cpu1, cpu2, cpu3;
	CheckboxGroup cbg;
	
	public Checkbox_3(String str) {
		
		super(str);
				
		setLayout(new FlowLayout());
		
		Label lbl1 = new Label("��ġ���ִ� OS ����(����)", Label.CENTER);
		lbl1.setBackground(new Color(0,220,255));
		lbl1.setForeground(new Color(255,120,0));
		
		add(lbl1);
		
		os1 = new Checkbox("������ 98");
		
		os2 = new Checkbox("������ XP");
		os2.setBackground(new Color(255,180,0));
		os2.setForeground(new Color(0,120,255));

		os3 = new Checkbox("������ 10");
		
		add(os1); add(os2); add(os3);
		
		Label lbl2 = new Label("��ǻ�� CPU ���� ����",Label.CENTER);
		add(lbl2);
		
		cbg = new CheckboxGroup();
		cpu1 = new Checkbox("��Ƽ��4",cbg,false);
		cpu1.setBackground(new Color(0,120,255));
		cpu1.setForeground(new Color(255,180,0));
		
		cpu2 = new Checkbox("������",cbg,false);
		
		cpu3 = new Checkbox("����ھ�",cbg,false);
		cpu3.setBackground(new Color(255,120,0));
		cpu3.setForeground(new Color(0,220,255));
		
		add(cpu1); add(cpu2); add(cpu3);
		
		setSize(460, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Checkbox_3("��ǻ��?");
	}
}
