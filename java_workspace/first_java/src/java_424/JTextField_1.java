package java_424;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JTextField_1 extends JFrame{

	private JButton button;
	private JTextField text,text2, result;

	public JTextField_1() {

		setSize(300, 130);
		setTitle("���� ����ϱ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ButtonListener listener = new ButtonListener();

		JPanel panel = new JPanel();
		panel.add(new JLabel("���� �Է�1 : "));

		text = new JTextField(15);

		text.addActionListener(listener);
		panel.add(text);
		panel.add(new JLabel("���� �Է�2 : "));

		text2 = new JTextField(15);

		text.addActionListener(listener);
		text2.addActionListener(listener);
		panel.add(text2);
		panel.add(new JLabel("������ ��: "));

		result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);

		button = new JButton("OK");
		button.addActionListener(listener);
		panel.add(button);
		add(panel);

		setVisible(true);
	}

	// ���� Ŭ�����μ� �ؽ�Ʈ �ʵ�� ��ư�� �׼� �̺�Ʈ ó��
	private class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			Object obj = e.getSource();

			if (obj == button || (obj == text || obj == text2) ) {
				if (obj == text) {
					text2.requestFocus();
					
				} 
				else {
					String name = text.getText();
					String name2 = text2.getText();
					int value = Integer.parseInt(name);
					int value2 = Integer.parseInt(name2);
					result.setText(" "+value*value2);
					text.requestFocus();
				}
			}
		}	
	}

	public static void main(String[] args) {
		new JTextField_1();
	}
}
