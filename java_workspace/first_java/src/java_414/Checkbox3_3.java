package java_414;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Checkbox3_3 {
	public static void main(String[] args) {

		Checkbox os1, os2, os3;
		Checkbox cpu1, cpu2, cpu3;
		CheckboxGroup cbg;

		Frame ff = new Frame("��ǻ�� ���3-3");
		
		ff.setLayout(new FlowLayout());

		Label lbl1 = new Label("��ġ���ִ� OS ����(����)", Label.CENTER);
		lbl1.setBackground(new Color(0,220,255));
		lbl1.setForeground(new Color(255,120,0));

		ff.add(lbl1);

		os1 = new Checkbox("������ 98");

		os2 = new Checkbox("������ XP");
		os2.setBackground(new Color(255,180,0));
		os2.setForeground(new Color(0,120,255));
		os3 = new Checkbox("������ 10");

		ff.add(os1); ff.add(os2); ff.add(os3);

		Label lbl2 = new Label("��ǻ�� CPU ���� ����",Label.CENTER);
		ff.add(lbl2);

		cbg = new CheckboxGroup();
		cpu1 = new Checkbox("��Ƽ��4",cbg,false);
		cpu1.setBackground(new Color(0,120,255));
		cpu1.setForeground(new Color(255,180,0));

		cpu2 = new Checkbox("������",cbg,false);

		cpu3 = new Checkbox("����ھ�",cbg,false);
		cpu3.setBackground(new Color(255,120,0));
		cpu3.setForeground(new Color(0,220,255));

		ff.add(cpu1); ff.add(cpu2); ff.add(cpu3);

		ff.setSize(460, 150);
		ff.setVisible(true);
	}
}
