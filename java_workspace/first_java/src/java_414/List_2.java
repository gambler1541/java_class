package java_414;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;

public class List_2 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("List Test~!@!@");
		
		ff.setLayout(new FlowLayout());
		
		List list = new List(4, true);		//4 => 4���� ������, true => ���߼����� ���
		Label lbl = new Label("List Test");
		
		List list2 = new List(3, false);
		Label lbl2 = new Label("Flower List");
		
		ff.add(lbl);
		list.add("386DX");
		list.add("486DX");
		list.add("486DX66");
		list.add("��Ƽ��4");
		list.add("������XP3");
		list.add("����ھ�");
		list.add("������");
		list.add("����");
		
		ff.add(list);
		
		ff.add(lbl2);
		list2.add("������");
		list2.add("����ȭ");
		list2.add("����ȭ");
		list2.add("����");
		list2.add("���");
		list2.add("�ҹ̲�");
		list2.add("�Ȱ���");
		list2.add("�����");
		
		ff.add(list2);
		
		ff.setVisible(true);
		ff.setSize(400,300);
	}
}
