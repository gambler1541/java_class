package java_414;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Choice_2 extends Frame{
	
	String[] continent = {"�ƽþ�","����","�Ƹ޸�ī","������ī","�����ƴϾ�"};
	String[] country = {"�ѱ�","������","ĳ����","�����","��������"};
	String[] city = {"����", "�ĸ�", "��Ÿ��", "���Ʈ","������"};
	
	
	public Choice_2(String str) {
		super(str);
		
		setLayout(new FlowLayout());
		
		Label lbl1 = new Label("����� �����Ͻÿ�");
		Label lbl2 = new Label("���� �����Ͻÿ�!");
		Label lbl3 = new Label("������ �����Ͻÿ�!!!");
		
		
		Choice choice1 = new Choice();
		Choice choice2 = new Choice();
		Choice choice3 = new Choice();
		
		
		for (int i = 0; i < continent.length; i++) {
			choice1.add(continent[i]);
		}
		
		for (int i = 0; i < country.length; i++) {
			choice2.add(country[i]);
		}
		
		for (int i = 0; i < city.length; i++) {
			choice3.add(city[i]);
		}
		
		add(lbl1); add(choice1);
		add(lbl2); add(choice2);
		add(lbl3); add(choice3);
		
		setSize(300, 200);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new Choice_2("Choice Test ~ ");
	}

}
