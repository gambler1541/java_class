package java_416;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayout_1 extends Frame {
	
	FlowLayout flo = new FlowLayout();
	Button[] btn = new Button[10];
	
	public FlowLayout_1(String name) {
		super(name);
//		setLayout(flo);
		
		for (int i = 0; i < 10; i++) {
			btn[i] = new Button(i + "¹öÆ°");
			add(btn[i]);
		}
		
		setBounds(200, 200, 150, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FlowLayout_1("FlowLayout Test");
	}
	
}
