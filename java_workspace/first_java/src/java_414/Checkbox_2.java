package java_414;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Checkbox_2 extends Frame{
	
	Checkbox cbx1 ,cbx2, cbx3, cbx4;
	CheckboxGroup cbg, cbg2;
	
	public Checkbox_2(String str) {
		super(str);
		
		setLayout(new FlowLayout());
		Label lbl = new Label("�����ϴ� ������?",Label.CENTER);
		lbl.setBackground(new Color(0,200,255));
		add(lbl);
		
		cbg = new CheckboxGroup();	
		cbx1 = new Checkbox("��",cbg,true);
		cbx2 = new Checkbox("����",cbg,true);
		cbx3 = new Checkbox("����",cbg,false);
		cbx4 = new Checkbox("�ܿ�",cbg,false);
		
		add(cbx1); add(cbx2);
		add(cbx3); add(cbx4);
		
		Label lbl2 = new Label("�����ϴ� ����?",Label.CENTER);
		lbl2.setBackground(new Color(0,255,70));
		add(lbl2);
		
		cbg2 = new CheckboxGroup();
		Checkbox cbx5 = new Checkbox("������",cbg2,false);
		Checkbox cbx6 = new Checkbox("�Ѷ��",cbg2,false);
		Checkbox cbx7 = new Checkbox("���ǻ�",cbg2,false);
		Checkbox cbx8 = new Checkbox("�ݰ���",cbg2,true);

		add(cbx5); add(cbx6);
		add(cbx7); add(cbx8);

		setSize(240, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Checkbox_2("üũ �ڽ� ����1");
	}
	
}
