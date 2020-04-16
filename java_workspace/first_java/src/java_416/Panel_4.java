package java_416;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;

public class Panel_4 extends Frame{
	
	public Panel_4(String str) {
		super(str);
		
		Panel panel1 = new Panel();
		panel1.setLayout(new GridLayout(4,2));
		
		panel1.setBackground(new Color(255,200,0));
		panel1.add(new Label(""));
		panel1.add(new Checkbox("리눅스"));
		panel1.add(new Label(""));
		panel1.add(new Checkbox("윈도우10"));
		panel1.add(new Label(""));
		panel1.add(new Checkbox("리눅스"));
		panel1.add(new Label(""));
		panel1.add(new Checkbox("윈도우10"));
		
		
		Panel panel2 = new Panel();
		
		panel2.setBackground(new Color(0,200,255));
		panel2.add(new Label("환경설정", Label.CENTER));
		panel2.add(new Button("불러오기"));
		panel2.add(new Button("저장"));
		panel2.add(new Button("다른이름으로 저장"));
		
		Panel panel3 = new Panel();
		
		CheckboxGroup cbg = new CheckboxGroup();
		panel3.setLayout(new GridLayout(3,2));
		panel3.setBackground(new Color(200,200,200));
		panel3.add(new Label(""));
		panel3.add(new Checkbox("무궁화",cbg,false));
		panel3.add(new Label(""));
		panel3.add(new Checkbox("개나리",cbg,false));
		panel3.add(new Label(""));
		panel3.add(new Checkbox("라일락",cbg,false));
		
		add("North", panel1);
		add("Center", panel2);
		add("South", panel3);
		
		setSize(600, 600);
		setVisible(true);
	
	}
	public static void main(String[] args) {
		new Panel_4("Panel4 Test");
	}
}
