package java_421;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class Component_1 extends Frame implements ActionListener, ComponentListener {
	TextArea txt;
	Button btn;
	
	public Component_1(String title) {
		super(title);
		
		btn = new Button("화면에서 잠시 사라짐~");
		btn.addActionListener(this);
		
		add("South", btn);
		
		txt = new TextArea();
		add("Center", txt);
		addComponentListener(this);
		
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Component_1("Component Test~~");
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try { 
			// this.hide();
			this.setVisible(false); // 화면에서 사라짐
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		this.setVisible(true);
	}
	
	@Override
	public void componentResized(ComponentEvent e) {
		txt.append("컴포넌트 크기 변경 ~~~ \n");
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		txt.append("컴포넌트 이동동 변경 %%%% \n");
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		txt.append("컴포넌트가 화면에 나타남 ^^^^^^^^\n");
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		txt.append(" 컴포넌트가 숨겨짐 ~~!~~~~~~ \n");
	}


}
