package java_421;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ScrollbarFrameTest {
	public static void main(String[] args) {
		MyFrame ff = new MyFrame("My Spped ~~~");
		
		Graphics gg = ff.getGraphics();
		gg.setColor(Color.red);
		
		for (int i = 0; true ; i += ff.speed) {
			
			try { 
				Thread.sleep(100);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			gg.clearRect(0, 0, 300, 350);
			gg.drawString("¹Ú¸í¹è", 180, i);
			
			i = (i < 350) ? i : 0;
		}
	}
}

class MyFrame extends Frame {
	int speed;
	Scrollbar sbb = new Scrollbar(Scrollbar.VERTICAL, 1, 15, 0, 95);
	
	Label lSpeed = new Label("Speed : 1");
	
	public MyFrame(String str) {
		super(str);
		
		lSpeed.setBackground(Color.green);
		lSpeed.setSize(70, 20);
		lSpeed.setLocation(20, 40);
		
		sbb.setSize(20, 300);
		sbb.setLocation(250, 20);
		
		add(sbb);
		add(lSpeed);
		
		sbb.addAdjustmentListener(new MyHandler());
		
		addWindowListener(new MyHandler());
		
		setSize(350, 350);
		setLayout(null);
		setVisible(true);
		setResizable(false);
	}
	
	class MyHandler extends WindowAdapter implements AdjustmentListener{

		@Override
		public void adjustmentValueChanged(AdjustmentEvent e) {
			speed = sbb.getValue();
			lSpeed.setText("Speed : " + speed);
		}
		
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		
	}
}

