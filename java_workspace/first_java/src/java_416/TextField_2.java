package java_416;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;

public class TextField_2 extends Frame{
	
	public TextField_2(String title) {
		
		super(title);
		
		setLayout(new FlowLayout());
		
		TextArea txt1 = new TextArea(10, 30);
		TextField txt2 = new TextField("�ȳ��ϼ���", 20);
		
		txt1.setText("���ڿ� �Է�~~");
		txt1.setBackground(new Color(0,150,255));
		txt1.setFont(new Font("�ü�ü", Font.ITALIC|Font.BOLD, 18));	// | : �������� �Ӽ��� �ѹ��� �ֱ�
		txt1.setForeground(new Color(255,120,0));
		
		txt2.setEchoChar('#');			
		txt2.setForeground(new Color(255,120,0));
		
		add(txt1);
		add(txt2);
		
		setSize(330,330);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		new TextField_2("Text Field 2");
		
	}
}
