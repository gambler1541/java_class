package java_427;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorChoose_1 extends JFrame implements ChangeListener{
	
	protected JColorChooser color;
	
	public ColorChoose_1() {
		setTitle("���� ���ñ� �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		color = new JColorChooser(); //������ ȣ��
		color.getSelectionModel().addChangeListener(this); // �����ʵ��
		color.setBorder(BorderFactory.createTitledBorder("���� ����"));
		
		JPanel panel = new JPanel();
		
		panel.add(color);
		add(panel);
		
		pack();		// �����̳��� ũ�⸦ ���� ��ҵ��� ũ��� ����
		this.setVisible(true);
	
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		Color newColor = color.getColor();
		System.out.println(newColor);
	}
	
	public static void main(String[] args) {
		new ColorChoose_1();
	}

}
