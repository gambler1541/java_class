package java_424;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Radio_1 extends JFrame{

	JCheckBox win, linux, solaris;
	JRadioButton river1, river2, river3;

	public Radio_1(String title) {
		super(title);

		getContentPane().setLayout(new FlowLayout());
		win = new JCheckBox("������", false);
		linux = new JCheckBox("������", true);
		solaris = new JCheckBox("�ֶ󸮽�", false);

		ButtonGroup group2 = new ButtonGroup();
		river1 = new JRadioButton("�Ѱ�", true);
		river2 = new JRadioButton("�θ���", false);
		river3 = new JRadioButton("���갭", false);
		
		group2.add(river1);
		group2.add(river2);
		group2.add(river3);
		
		getContentPane().add(win);
		getContentPane().add(linux);
		getContentPane().add(solaris);
		
		getContentPane().add(new JLabel("                 "));
		getContentPane().add(river1);
		getContentPane().add(river2);
		getContentPane().add(river3);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}



	public static void main(String[] args) {
		new Radio_1("Radio Test~~");
	}
}
