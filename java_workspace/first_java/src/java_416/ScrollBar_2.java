package java_416;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollBar_2 extends Frame implements AdjustmentListener{

	Scrollbar red,green,blue;
	Panel panel1, panel2;
	
	public ScrollBar_2(String title) {
	
		super(title);
		setLayout(null);
		
		red = new Scrollbar(Scrollbar.HORIZONTAL, 10,20,0,275);
		green = new Scrollbar(Scrollbar.HORIZONTAL, 10,20,0,275);
		blue = new Scrollbar(Scrollbar.HORIZONTAL, 10,20,0,275);
		
		
		// ��ũ�ѹٿ� �̺�Ʈ�� ��
		red.addAdjustmentListener(this);
		green.addAdjustmentListener(this);
		blue.addAdjustmentListener(this);
		
		
		// �гε� �ٸ����� ���� �� �ִ� ������Ʈ
		panel1 = new Panel();
		panel2 = new Panel();
		panel2.setLayout(new FlowLayout());
		
		panel1.setLocation(10,10);
		panel1.setSize(200,200);
		
		panel2.setLocation(10,230);
		panel2.setSize(200,300);
		
		
		panel2.add(red);
		panel2.add(green);
		panel2.add(blue);
		
		// panel1,2�� Frame�� add
		add(panel1);
		add(panel2);
		
		setSize(300, 300);
		setVisible(true);
		
	}
	
	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {		// ��ũ�ѹٰ� �̵��������� ����
		
		
		panel1.setBackground(new Color(red.getValue(),
								 	   green.getValue(),
								 	   blue.getValue()));
		
		System.out.println("����" + red.getValue());
		System.out.println("�ʷ�" + green.getValue());
		System.out.println("�Ķ�" + blue.getValue());
		
		
	}
	
	
	public static void main(String[] args) {
		new ScrollBar_2("Scrollbar2 Test");
	}
}
