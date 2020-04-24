package java_424;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableExample extends JFrame{

	JTable table;
	String[] fieldname = {
			"<html><font color=cyan size=5>학번</font></html>",
			"<html><font color=red size=5>국어</font></html>",
			"<html><font color=yellow size=5>수학</font></html>",
	"<html><font color=blue size=5>영어</font></html>",
			"<html><font color=blue size=5>과학</font></html>"};

	String[][] data = {
			{"2001300912","67","90","90","80"},
			{"2001201232","95","80","70","70"},
			{"2001911382","60","95","54","50"},
			{"2001512011","45","30","70","50"},
			{"2003306132","100","100","100","100"},
			{"2002431612","50","90","55","95"}
	};

	public JTableExample(String title) {
		super(title);

		table = new JTable(data, fieldname);
		JScrollPane sp = new JScrollPane(table);

		getContentPane().add(sp, "Center");

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setSize(350, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JTableExample("JTable Example ~~");
	}

}
