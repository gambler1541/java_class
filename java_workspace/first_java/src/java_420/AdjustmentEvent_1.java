package java_420;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class AdjustmentEvent_1 extends Frame implements AdjustmentListener{
	
	Scrollbar r, g, b;
	Panel panel;
	
	public AdjustmentEvent_1(String title) {
		super(title);
		
		r = new Scrollbar(Scrollbar.HORIZONTAL, 100,20,0,275);
		g = new Scrollbar(Scrollbar.HORIZONTAL, 100,20,0,275);
		b = new Scrollbar(Scrollbar.HORIZONTAL, 255,20,0,275);

		
//		r.addAdjustmentListener(new Handler());
//		g.addAdjustmentListener(new Handler());
//		b.addAdjustmentListener(new Handler());
	
		r.addAdjustmentListener(this);
		g.addAdjustmentListener(this);
		b.addAdjustmentListener(this);
		
		panel = new Panel();
		
		panel.add(r);
		panel.add(g);
		panel.add(b);
		
		
		add("Center", panel);
		
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new AdjustmentEvent_1("Adjustment Event Test~~");
	}
	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		int red, green, blue;
		
		red = r.getValue();
		green = g.getValue();
		blue = b.getValue();
		
		
		System.out.println("red: " + red + ", green: " + green + ", blue: " + blue);
		panel.setBackground(new Color(red,green,blue));
	} 

//	class Handler implements AdjustmentListener{
//
//		@Override
//		public void adjustmentValueChanged(AdjustmentEvent e) {
//			int red, green, blue
//			
//			red = r.getValue();
//			green = g.getValue();
//			blue = b.getValue();
//			
//			
//			System.out.println("red: " + red + ", green: " + green + ", blue: " + blue);
//			panel.setBackground(new Color(red,green,blue,alpha));
//		} 
//		
//	}
}
