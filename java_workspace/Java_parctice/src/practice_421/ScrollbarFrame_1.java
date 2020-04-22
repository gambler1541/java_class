package practice_421;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyFrame extends Frame  {
	int speed;
	Scrollbar sbb = new Scrollbar(Scrollbar.HORIZONTAL, 1, 15,0, 95);
	Label lspeed = new Label("Speed : 1");
	
	public MyFrame(String title) {
		super(title);

		lspeed.setBackground(Color.green);
		lspeed.setSize(70, 20);
		lspeed.setLocation(20, 40);
		
		sbb.setSize(300, 20);
		sbb.setLocation(20, 250);
		
		add(sbb);
		add(lspeed);
		
		sbb.addAdjustmentListener(new Handler());
		
		addWindowListener(new Handler());
		
		setSize(350, 350);
		setLayout(null);
		setVisible(true);
		setResizable(false);
	}

	class Handler extends WindowAdapter implements AdjustmentListener {

		@Override
		public void adjustmentValueChanged(AdjustmentEvent e) {
			speed = sbb.getValue();
			lspeed.setText("Speeld : " +  speed);
		}
		
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}


public class ScrollbarFrame_1 {
	public static void main(String[] args) {
		MyFrame ff = new MyFrame("My speed");
		Graphics gg = ff.getGraphics();
		
		gg.setColor(Color.red);
		
		for (int i = 0; true ; i += ff.speed) {
			
			try {
				Thread.sleep(100);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			gg.clearRect(0, 0, 350, 300);
			gg.drawString("¹Ú¸í¹è", i, 180);
			
			i = (i < 350) ? i : 0;
		}
	}
}
