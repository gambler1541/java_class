package java_416;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class BorderLayout_1 extends Frame{

	BorderLayout bbl = new BorderLayout();
	
	public BorderLayout_1(String str) {
		super(str);
		
		setLayout(bbl);
		
		add("North", new Button("����")).setBackground(new Color(255,100,0));
		add("West", new Button("����")).setBackground(new Color(40,100,90));
		add("East", new Button("����")).setBackground(new Color(40,120,255));
		add("Center", new Button("�߾�")).setBackground(new Color(255,180,220));
		add("South", new Button("����")).setBackground(new Color(120,100,100));
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new BorderLayout_1("BorderLayout Test ~~~");
	}
}
