package java_416;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class Panel_3 extends Frame{
	
	Panel n,w,e,c,s;
	
	
	public Panel_3(String title) {
		super(title);
		
		n = new Panel();
		w = new Panel();
		e = new Panel();
		c = new Panel();
		s = new Panel();
	
		n.setBackground(new Color(0, 90, 255));
		w.setBackground(new Color(255, 90, 0));
		e.setBackground(new Color(0, 255, 130));
		c.setBackground(new Color(200, 180, 255));
		s.setBackground(new Color(100, 255, 100));
		
		n.add(new Button("其澄 1"));
		w.add(new Button("其澄 2"));
		e.add(new Button("其澄 3"));
		c.add(new Button("其澄 4"));
		s.add(new Button("其澄 5"));
		
		
		add("North",n);
		add("West",w);
		add("East",e);
		add("Center",c);
		add("South",s);
		
		setSize(500, 500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Panel_3("Panel Test");
	}
}
