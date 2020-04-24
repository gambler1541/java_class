package java_424;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TabWindows extends JFrame implements ChangeListener{

	JTabbedPane pane;
	JLabel lbl_info;
	
	public TabWindows(String title) {
		super(title);
		JPanel one, two, three;
		pane = new JTabbedPane();
		lbl_info = new JLabel("        ");
		
		one = new JPanel();
		one.add(new JLabel("ù��° ���Դϴ�."));
		one.add(new JTextField("���ڸ� �Է��ϼ���."));
		one.setBackground(Color.red);
		pane.addTab("<html><font color=red>One</font></html>", one);
		
		two = new JPanel();
		two.add(new JLabel("�ι�° ���Դϴ�."));
		two.setBackground(Color.cyan);
		pane.addTab("<html><font color=blue>Two</font></html>", two);
		
		three = new JPanel();
		three.add(new JLabel("����° ���Դϴ�."));
		three.setBackground(Color.blue);
		pane.addTab("<html><font color=blue>three</font></html>", three);
		
		pane.setSelectedIndex(0);
		pane.addChangeListener(this);
		this.getContentPane().add("North", new JLabel("���� ����� ����.."));
		this.getContentPane().add("Center", pane);
		this.getContentPane().add("South", lbl_info);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		int Index = pane.getSelectedIndex();
		String msg = "<html><font size=5 color=pink>" + pane.getTitleAt(Index);
		msg += " ���� ���� �Ǿ����ϴ�." + "</font></html>";
		lbl_info.setText(msg);
		pane.setSelectedIndex(Index);
	}
	public static void main(String[] args) {
		new TabWindows("TabWindows Test~~");
	}
}
