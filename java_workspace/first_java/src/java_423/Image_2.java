package java_423;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Image_2 extends Frame implements ActionListener  {

	Image img;
	XCanvas_3 canvas;
	
	Button[] btn = new Button[7];
	String[] btn_str = {"�⺻", "Ȯ��", "���","����","�¿�","����","�̹����ҷ�����"};
	
	TextField txt;
	int message = 0;
	
	static final int �⺻ = 0;
	static final int Ȯ�� = 1;
	static final int ��� = 2;
	static final int ���� = 3;
	static final int �¿� = 4;
	static final int ���� = 5;
	
	String ss = "src\\images\\syk.jpg";
	
	public Image_2(String title) {
		super(title);
		
		img = Toolkit.getDefaultToolkit().getImage(ss);
		
		canvas = new XCanvas_3();
		canvas.setSize(550, 450);
		
		Panel panel1 = new Panel();
		Panel panel2 = new Panel();
		
		panel1.setBackground(Color.blue);
		panel2.setBackground(Color.yellow);
		
		for (int i = 0; i < 6; i++) {
			
			btn[i] = new Button(btn_str[i]);
			btn[i].addActionListener(this);
			panel1.add(btn[i]);
		}
		panel2.add(new Label("���� �ҷ�����"));
		txt = new TextField("src\\images\\finland.jpg", 20);
		
		panel2.add(txt);
		
		btn[6] = new Button(btn_str[6]);
		btn[6].addActionListener(this);
		
		panel2.add(btn[6]);
		
		add("North", panel2);
		add("Center", canvas);
		add("South", panel1);
		
		addWindowListener(new Handler());
		
		setSize(550, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Image_2("Image Test2~~");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Button obj = (Button) e.getSource();
		
		if (obj == btn[0]) {
			message = �⺻;
			
		}else if (obj == btn[1]) {
			message = Ȯ��;
		}else if (obj == btn[2]) {
			message = ���;
		}else if (obj == btn[3]) {
			message = ����;
		}else if (obj == btn[4]) {
			message = �¿�;
		}else if (obj == btn[5]) {
			message = ����;
		}else {
			ss = txt.getText();
			img = Toolkit.getDefaultToolkit().getImage(ss);
		}
		canvas.repaint();
	}
	
	class XCanvas_3 extends Canvas{
		
		@Override
		public void paint(Graphics g) {
			switch (message) {
			case �⺻:
				g.drawImage(img, 0,0,this);
				break;
			
			case Ȯ��:
				g.drawImage(img, 0, 0,
						img.getWidth(this) * 2, img.getHeight(this)* 2,0
						,0, img.getWidth(this),img.getHeight(this),
						this);
				break;
			
			case ���:
				g.drawImage(img, 0, 0, 
						img.getWidth(this) / 2, img.getHeight(this) / 2,0
						,0, img.getWidth(this),img.getHeight(this)
						,this);
				break;
				
			case ����:
				g.drawImage(img,0, img.getHeight(this), 
						img.getWidth(this), 0, 0,
						0, img.getWidth(this), img.getHeight(this),
						this);
				break;
				
			case �¿�:
				g.drawImage(img,img.getWidth(this)
						,0,0,img.getHeight(this)
						,0,0,img.getWidth(this)
						,img.getHeight(this),this);
				break;
				
			case ����:
				g.drawImage(img, img.getHeight(this), img.getWidth(this)
						, 0, 0, 0, 
						0, img.getWidth(this), img.getHeight(this),
						this);
				break;
			}
		}
	}
	
	class Handler extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
}
