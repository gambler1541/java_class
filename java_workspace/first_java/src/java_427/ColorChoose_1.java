package java_427;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorChoose_1 extends JFrame implements ChangeListener{
	
	protected JColorChooser color;
	
	public ColorChoose_1() {
		setTitle("색상 선택기 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		color = new JColorChooser(); //생성자 호출
		color.getSelectionModel().addChangeListener(this); // 리스너등록
		color.setBorder(BorderFactory.createTitledBorder("색상 선택"));
		
		JPanel panel = new JPanel();
		
		panel.add(color);
		add(panel);
		
		pack();		// 컨테이너의 크기를 구성 요소들의 크기로 설정
		this.setVisible(true);
	
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		Color newColor = color.getColor();
		System.out.println(newColor);
	}
	
	public static void main(String[] args) {
		new ColorChoose_1();
	}

}
