package java_414;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Label_1 {
	public static void main(String[] args) {
		
		Label label1, label2, label3, label4;
		
		Frame ff = new Frame("�������� ���̺�~~~");
		
		ff.setLayout(new FlowLayout());
		
		label1 = new Label("��");
		label2 = new Label("����");
		label3 = new Label("����");
		label4 = new Label("�ܿ�");
		
		ff.setBackground(new Color(0,180,255));
		label1.setBackground(new Color(0, 100, 255));
		label1.setForeground(new Color(255, 100, 0));
		
		label2.setBackground(new Color(0, 100, 255));
		label2.setForeground(new Color(0, 200, 200));
		
		label3.setBackground(new Color(0, 100, 255));
		label3.setForeground(new Color(255, 200, 0));
		
		label4.setBackground(new Color(0, 100, 255));
		label4.setForeground(new Color(0, 170, 170));
		
		
		ff.add(label1);
		ff.add(label2);
		ff.add(label3);
		ff.add(label4);
		
		ff.setSize(300, 300);
		ff.setVisible(true);
		
	}
}
