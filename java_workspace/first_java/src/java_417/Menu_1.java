package java_417;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Menu_1 extends Frame{
	public Menu_1(String str) {
		super(str);
		
		MenuBar mb = new MenuBar();
		Menu file = new Menu("����");
		Menu file_new = new Menu("�� ����");
		MenuItem file_open = new MenuItem("�ҷ�����");
		MenuItem file_close = new MenuItem("���ϴݱ�");
		
		
		file.add(file_new);
		file.add(file_open);
		file.add(file_close);
		
		Menu edit = new Menu("����");
		
		MenuItem edit_cut = new MenuItem("�����α�");
		MenuItem edit_paste = new MenuItem("���̱�");
		

		edit.add(edit_cut);
		edit.add(edit_paste);
		
		Menu run = new Menu("����");
		
		MenuItem resume = new MenuItem("�����ϱ�");
		MenuItem suspend = new MenuItem("�״��");
		MenuItem terminate = new MenuItem("���");
		
		run.add(resume);
		run.add(suspend);
		run.add(terminate);
		
		mb.add(file);
		mb.add(edit);
		mb.add(run);
		
		setMenuBar(mb);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Menu_1("�޴�");
	}
}
