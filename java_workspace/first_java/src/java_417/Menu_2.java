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
		Menu file = new Menu("파일");
		
		CheckboxMenuItem file_new = new CheckboxMenuItem("새파일", true);
		CheckboxMenuItem file_open = new CheckboxMenuItem("불러오기");
		MenuItem file_separator = new MenuItem("-");	// separator는 "-"하나만 허용함
		
		Menu file_close = new Menu("파일닫기");
		MenuItem close_ok= new MenuItem("닫기");
		MenuItem close_cancel = new MenuItem("취소");
		
		file_close.add(close_ok);
		file_close.add(close_cancel);
		
		
		file.add(file_new);
		file.add(file_open);
		file.add(file_separator);
		file.add(file_close);
		
		Menu edit = new Menu("편집");
		
		MenuItem edit_cut = new MenuItem("오려두기");
		MenuItem edit_paste = new MenuItem("붙이기");
		

		edit.add(edit_cut);
		edit.add(edit_paste);
		

		file.add(edit);
		
		mb.add(file);
		
		setMenuBar(mb);
		setSize(300,300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Menu_2("메뉴2");
	}
}
