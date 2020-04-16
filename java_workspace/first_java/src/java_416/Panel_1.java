package java_416;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class Panel_1 extends Frame{
	public static void main(String[] args) {
		
		Frame ff = new Frame("Panel Test~~");
		
		ff.setSize(300, 420);
		ff.setLayout(null);
		
		Panel p1 = new Panel();
		p1.setBackground(new Color(0,120,255));
		p1.setSize(150,100);
		p1.setLocation(50, 50);
	
		Panel p2 = new Panel();
		p2.setBackground(new Color(250,200,80));
		p2.setSize(150,100);
		p2.setLocation(50, 170);
		
		Panel p3 = new Panel();
		p3.setBackground(new Color(120,255,200));
		p3.setSize(150,100);
		p3.setLocation(50, 290);
		
		
		
		Button ok = new Button("OK~~~");
		Button ok2 = new Button("Yes~~~");
		Label cancel = new Label("CANCEL", Label.CENTER);
		
		p1.add(ok);
		p2.add(cancel);
		p3.add(ok2);
		
		ff.add(p1);
		ff.add(p2);
		ff.add(p3);
		
		
		ff.setVisible(true);
	}
	
}
