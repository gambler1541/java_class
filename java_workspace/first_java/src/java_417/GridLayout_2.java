package java_417;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class GridLayout_2 extends Frame{

	public GridLayout_2(String str) {
		
		super(str);
		
		setLayout(new GridLayout(3,2));
		List list = new List(5, false);
		Choice choice = new Choice();
		Panel panel = new Panel();
		
		panel.add(new Button("����"));
		panel.add(new Button("����"));
		
		
		
		list.add("������");
		list.add("����ȭ");
		list.add("����ȭ");
		list.add("�ε鷹");
		list.add("����");
		
		choice.add("�Ѱ�");
		choice.add("������");
		choice.add("������");
		choice.add("�зϰ�");
		
		add(new Button("Button1"));
		add(list);
		add(choice);
		add(new TextArea("�Ƹ��ٿ� ���",5,15));
		add(new TextField("TextField"));
		add(panel);
		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new GridLayout_2("GridLayout Test2 ~~~");
		
	}
}
