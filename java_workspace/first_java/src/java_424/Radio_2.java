package java_424;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Radio_2 extends JFrame implements ActionListener{
	
	private JRadioButton small, medium, large;
	private JRadioButton tea_1, tea_2, tea_3;
	private JLabel text;
	private JPanel topPanel, sizePanel, twoPanel,
				   boxPanel, resultPanel;
	
	public Radio_2() {
		
		setTitle("라디오 버튼 테스트");
		setSize(430, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		topPanel = new JPanel();
		JLabel label = new JLabel("어떤 크기의 커피를 주문하시겠습니까?");
		topPanel.add(label);
		
		add(topPanel, BorderLayout.NORTH);
		
		sizePanel = new JPanel();
		small = new JRadioButton("Small Size");
		medium = new JRadioButton("Medium Size");
		large = new JRadioButton("Large Size");
		
		twoPanel = new JPanel();
		tea_1 = new JRadioButton("tea_1 Good");
		tea_2 = new JRadioButton("tea_2 Good");
		tea_3 = new JRadioButton("tea_3 Good");
	
		ButtonGroup size = new ButtonGroup();
		
		size.add(small);
		size.add(medium);
		size.add(large);
		
		ButtonGroup teatea = new ButtonGroup();
		
		teatea.add(tea_1);
		teatea.add(tea_2);
		teatea.add(tea_3);
		
		small.addActionListener(this);
		medium.addActionListener(this);
		large.addActionListener(this);
		
		tea_1.addActionListener(this);
		tea_2.addActionListener(this);
		tea_3.addActionListener(this);
		
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		
		twoPanel.add(tea_1);
		twoPanel.add(tea_2);
		twoPanel.add(tea_3);
		
		boxPanel = new JPanel(new GridLayout(3, 1));
		
		boxPanel.add(sizePanel);
		boxPanel.add(new JLabel("좋아하는 티를 선택 하시오!!", JLabel.CENTER));
		boxPanel.add(twoPanel);
		add(boxPanel, BorderLayout.CENTER);
		
		
		resultPanel = new JPanel();
		text = new JLabel("크기가 선택되지 않았습니다");
		text.setForeground(Color.red);
		
		
		resultPanel.add(text);
		add(resultPanel, BorderLayout.SOUTH);
		setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new Radio_2();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JRadioButton obj = (JRadioButton) e.getSource();
		
		if (obj == small) {
			text.setText("Small 크기가 선택되었습니다.");
		}
		if (obj == medium) {
			text.setText("Medium 크기가 선택되었습니다.");
		}
		if (obj == large) {
			text.setText("Large 크기가 선택되었습니다.");
		}
		if (obj == tea_1) {
			text.setText(tea_1.getText() + " 좋아합니다.");
		}
		if (obj == tea_2) {
			text.setText(tea_2.getText() + " 좋아합니다.");
		}
		if (obj == tea_3) {
			text.setText(tea_3.getText() + " 좋아합니다.");
		}
	}
	
}
