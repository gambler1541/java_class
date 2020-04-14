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

		Frame ff = new Frame("컴퓨터 사양3-3");
		
		ff.setLayout(new FlowLayout());

		Label lbl1 = new Label("설치되있는 OS 선택(복수)", Label.CENTER);
		lbl1.setBackground(new Color(0,220,255));
		lbl1.setForeground(new Color(255,120,0));

		ff.add(lbl1);

		os1 = new Checkbox("윈도우 98");

		os2 = new Checkbox("윈도우 XP");
		os2.setBackground(new Color(255,180,0));
		os2.setForeground(new Color(0,120,255));
		os3 = new Checkbox("윈도우 10");

		ff.add(os1); ff.add(os2); ff.add(os3);

		Label lbl2 = new Label("컴퓨터 CPU 종류 선택",Label.CENTER);
		ff.add(lbl2);

		cbg = new CheckboxGroup();
		cpu1 = new Checkbox("펜티엄4",cbg,false);
		cpu1.setBackground(new Color(0,120,255));
		cpu1.setForeground(new Color(255,180,0));

		cpu2 = new Checkbox("셀러론",cbg,false);

		cpu3 = new Checkbox("듀얼코어",cbg,false);
		cpu3.setBackground(new Color(255,120,0));
		cpu3.setForeground(new Color(0,220,255));

		ff.add(cpu1); ff.add(cpu2); ff.add(cpu3);

		ff.setSize(460, 150);
		ff.setVisible(true);
	}
}
