package java_417;

import java.awt.Checkbox;
import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Menu_2 extends Frame{

	public Menu_2(String str) {
	
		super(str);
		
		MenuBar mb = new MenuBar();
		Menu file = new Menu("����");
		
		CheckboxMenuItem file_new = new CheckboxMenuItem("������", true);
		CheckboxMenuItem file_open = new CheckboxMenuItem("�ҷ�����");
		MenuItem file_separator = new MenuItem("-");	// separator�� "-"�ϳ��� �����
		
		Menu file_close = new Menu("���ϴݱ�");
		MenuItem close_ok= new MenuItem("�ݱ�");
		MenuItem close_cancel = new MenuItem("���");
		
		file_close.add(close_ok);
		file_close.add(close_cancel);
		
		
		file.add(file_new);
		file.add(file_open);
		file.add(file_separator);
		file.add(file_close);
		
		Menu edit = new Menu("����");
		
		MenuItem edit_cut = new MenuItem("�����α�");
		MenuItem edit_paste = new MenuItem("���̱�");
		

		edit.add(edit_cut);
		edit.add(edit_paste);
		

		file.add(edit);
		
		mb.add(file);
		
		setMenuBar(mb);
		setSize(300,300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Menu_2("�޴�2");
	}
}
