package java_414;

import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Choice_1 extends Frame{

		public Choice_1(String str) {
			super(str);
			
			setLayout(new FlowLayout());
			
			Label lbl = new Label("������ �����Ͻÿ�", Label.CENTER);
			Label lbl2 = new Label("������ �����Ͻÿ�", Label.CENTER);
			Choice choice = new Choice();
			Choice choice2 = new Choice();
			
			choice.setBackground(new Color(255,0,180));
			choice2.setBackground(new Color(180,0,255));
			
			choice.add("���ѹα�");
			choice.add("�߱�");
			choice.add("ĳ����");
			choice.add("���þ�");
			choice.add("�̱�");
			choice.add("������");
			choice.add("������");
			
			choice2.add("����");
			choice2.add("����¡");
			choice2.add("��Ÿ��");
			choice2.add("��ũ��");
			choice2.add("������");
			choice2.add("�ĸ�");
			choice2.add("���帮��");
			
			add(lbl);
			add(choice);
			add(lbl2);
			add(choice2);
			
			setSize(300, 200);
			setVisible(true);
		}
	public static void main(String[] args) {
		new Choice_1("choice test");
	}
}
