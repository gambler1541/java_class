package java_414;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Checkbox_1 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("üũ �ڽ� �׽�Ʈ");
		ff.setLayout(new FlowLayout());
		
		Checkbox cbx_1 = new Checkbox("����",false);
		Checkbox cbx_2 = new Checkbox("����",true);
		
		ff.add(cbx_1);
		ff.add(cbx_2);
		
		ff.setSize(200, 200);
		ff.setVisible(true);
		
	}
}
