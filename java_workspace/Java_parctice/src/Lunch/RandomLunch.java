package Lunch;
import java.awt.*;
import java.awt.event.*;

public class RandomLunch extends Frame implements ActionListener
{
	Button b=null;
	TextField t=null;
 
	public RandomLunch(String str)
	{
		super(str);
  
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});

			b = new Button("- Á¡½É½Ä»ç »Ì±â -");
			t=new TextField("    °ú¿¬ °á°ú´Â?",15);
			
			Font ff = new Font("Serif", Font.PLAIN, 20);
			
			b.setForeground(new Color(255, 255, 255));
			b.setBackground(new Color(0, 0, 0));
			t.setFont(ff);
			t.setBackground(new Color(80, 150, 255));

			this.add(t, BorderLayout.CENTER);
			this.add(b, BorderLayout.SOUTH);
			b.addActionListener(this);
			
			Toolkit ttk = Toolkit.getDefaultToolkit();		
			
			Dimension screenSize = ttk.getScreenSize();
			
			setLocation((screenSize.width / 2 - 250), (screenSize.height / 2 - 250));
			
			setSize(500, 500);
		}

 public void actionPerformed(ActionEvent e){
  
	 int random = (int)(Math.random() * 16);
		
		if (random == 0)
		{
			String ss = "    µ·°¡½º";
			t.setText(ss);
		}
		else if (random == 1)
		{
			String ss = "    ¶±ººÀÌ";
			t.setText(ss);
		}
		else if (random == 2)
		{
			String ss = "    ¸¾½ºÅÍÄ¡";
			t.setText(ss);
		}
		else if (random == 3)
		{
			String ss = "    ·Ôµ¥¸®¾Æ";
			t.setText(ss);
		}
		else if (random == 4)
		{
			String ss = "    Â¯±ú";
			t.setText(ss);
		}
		else if (random == 5)
		{
			String ss = "    ³Ã¸é";
			t.setText(ss);
		}
		else if (random == 6)
		{
			String ss = "    ±è¹äÃµ±¹";
			t.setText(ss);
		}
		else if (random == 7)
		{
			String ss = "    ÆíÀÇÁ¡ÇÑ³¢";
			t.setText(ss);
		}
		else if (random == 8)
		{
			String ss = "    »ï°¢±è¹ä°ú ¶ó¸é";
			t.setText(ss);
		}
		else if (random == 9)
		{
			String ss = "    Äá³ª¹°±¹¹ä";
			t.setText(ss);
		}
		else if (random == 10)
		{
			String ss = "    ¸ð¹Ð";
			t.setText(ss);
		}
		else if (random == 11)
		{
			String ss = "    Åä½ºÆ®";
			t.setText(ss);
		}
		else if (random == 12)
		{
			String ss = "    ¿ìµ¿";
			t.setText(ss);
		}
		else if (random == 13)
		{
			String ss = "    ±è¹ä¤¡¤¡";
			t.setText(ss);
		}
		else if (random == 14)
		{
			String ss = "    --'s Choice";
			t.setText(ss);
		}
		else if (random == 15)
		{
			String ss = "    --'s Choice";
			t.setText(ss);
		}
	 
  
 }
 
 public static void main(String args[])
 {
	 RandomLunch bt=new RandomLunch("Á¡½É½Ä»ç »Ì±â");
	 bt.pack();
	 bt.setVisible(true);
 }
}
