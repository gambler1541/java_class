package java_424;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JButton_1 extends JPanel{
	
	public JButton_1() {
		setLayout(new GridLayout(1, 3, 5, 5));
		AbstractButton btn = new JButton("확인");
		
		add(btn);
		
		btn = new JButton("취소");
		add(btn);
		
		btn = new JButton("되돌리기");
		add(btn);
	}
	
	
	public Dimension getPreferredSize(){
		return new Dimension(400, 300);
		
		// Dimension() Dimension 클래스는 단일 객체에 있는
		// 컴포넌트의 가로 길이 및 세로 길이를 캡술화 합니다
	}
	
	public static void main(String[] args) {
		
		JFrame jff = new JFrame("JButton Test~~~");
		
		JButton_1 panel = new JButton_1();
		
		jff.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jff.getContentPane().add(panel, "Center");
		// jFrame 에 jButton을 등록하기위해
		// getContentPane().add() 처럼 사용합니다. AWT의 Frame 에서
		// 화면에 컴포넌트를 추가할 경우에 add() 메소드를 이용하지만
		// Swing 에서는 getContentPane().add() 처럼 사용합니다.
		
		jff.setSize(panel.getPreferredSize());
		jff.setVisible(true);
	}
}
