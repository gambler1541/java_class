package java_414;

import java.awt.Frame;

public class Frame_1 extends Frame{
	
	public Frame_1(String str) {
	
		super(str);
		
		setSize(300, 300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		
		new Frame_1("아름다운 수선화~~");
		
	}
}
