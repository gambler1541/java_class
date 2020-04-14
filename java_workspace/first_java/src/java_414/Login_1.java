package java_414;

import java.awt.Frame;
import java.awt.Label;

public class Login_1 {
	public static void main(String[] args) {
		
		Frame ff = new Frame("Login");
		
		ff.setSize(300, 200);
		ff.setLayout(null);
		
		Label id = new Label("ID : ");
		id.setBounds(100, 100, 30, 18);
		
		Label pwd = new Label("Password : ");
		pwd.setBounds(100, 120, 100, 18);
		
		Label addr = new Label("address : ");
		addr.setBounds(100, 140, 100, 18);
		ff.add(id);
		ff.add(pwd);
		ff.add(addr);
		
		ff.setVisible(true);
	}
}
