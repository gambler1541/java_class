package java_417;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Menu_1 extends Frame{
	public Menu_1(String str) {
		super(str);
		
		MenuBar mb = new MenuBar();
		Menu file = new Menu("파일");
		Menu file_new = new Menu("새 파일");
		MenuItem file_open = new MenuItem("불러오기");
		MenuItem file_close = new MenuItem("파일닫기");
		
		
		file.add(file_new);
		file.add(file_open);
		file.add(file_close);
		
		Menu edit = new Menu("편집");
		
		MenuItem edit_cut = new MenuItem("오려두기");
		MenuItem edit_paste = new MenuItem("붙이기");
		

		edit.add(edit_cut);
		edit.add(edit_paste);
		
		Menu run = new Menu("실행");
		
		MenuItem resume = new MenuItem("실행하기");
		MenuItem suspend = new MenuItem("그대로");
		MenuItem terminate = new MenuItem("취소");
		
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
		new Menu_1("메뉴");
	}
}
