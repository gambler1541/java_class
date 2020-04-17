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
		
		panel.add(new Button("시작"));
		panel.add(new Button("중지"));
		
		
		
		list.add("개나리");
		list.add("수선화");
		list.add("무궁화");
		list.add("민들레");
		list.add("벚꽃");
		
		choice.add("한강");
		choice.add("낙동강");
		choice.add("임진강");
		choice.add("압록강");
		
		add(new Button("Button1"));
		add(list);
		add(choice);
		add(new TextArea("아름다운 모습",5,15));
		add(new TextField("TextField"));
		add(panel);
		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new GridLayout_2("GridLayout Test2 ~~~");
		
	}
}
