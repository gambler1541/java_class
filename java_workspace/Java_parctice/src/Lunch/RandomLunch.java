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

			b = new Button("- ���ɽĻ� �̱� -");
			t=new TextField("    ���� �����?",15);
			
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
			String ss = "    ������";
			t.setText(ss);
		}
		else if (random == 1)
		{
			String ss = "    ������";
			t.setText(ss);
		}
		else if (random == 2)
		{
			String ss = "    ������ġ";
			t.setText(ss);
		}
		else if (random == 3)
		{
			String ss = "    �Ե�����";
			t.setText(ss);
		}
		else if (random == 4)
		{
			String ss = "    ¯��";
			t.setText(ss);
		}
		else if (random == 5)
		{
			String ss = "    �ø�";
			t.setText(ss);
		}
		else if (random == 6)
		{
			String ss = "    ���õ��";
			t.setText(ss);
		}
		else if (random == 7)
		{
			String ss = "    �������ѳ�";
			t.setText(ss);
		}
		else if (random == 8)
		{
			String ss = "    �ﰢ���� ���";
			t.setText(ss);
		}
		else if (random == 9)
		{
			String ss = "    �ᳪ������";
			t.setText(ss);
		}
		else if (random == 10)
		{
			String ss = "    ���";
			t.setText(ss);
		}
		else if (random == 11)
		{
			String ss = "    �佺Ʈ";
			t.setText(ss);
		}
		else if (random == 12)
		{
			String ss = "    �쵿";
			t.setText(ss);
		}
		else if (random == 13)
		{
			String ss = "    ��䤡��";
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
	 RandomLunch bt=new RandomLunch("���ɽĻ� �̱�");
	 bt.pack();
	 bt.setVisible(true);
 }
}
