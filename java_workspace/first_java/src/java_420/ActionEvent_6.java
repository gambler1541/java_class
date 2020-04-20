package java_420;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_6 extends Frame implements ActionListener{
	
	Label lid, lpwd;
	TextField tfId, tfPwd;
	Button ok;
	
	public ActionEvent_6(String title) {
		super(title);
		
		lid = new Label("ID : ", Label.RIGHT);
		lpwd = new Label("PWD : ", Label.RIGHT);
		
		tfId = new TextField(10);
		tfPwd = new TextField(10);
		tfPwd.setEchoChar('*');
		ok = new Button("OK");
		
		tfId.addActionListener(this);
		tfPwd.addActionListener(this);
		ok.addActionListener(this);
		
		setLayout(new FlowLayout());
		
		add(lid); add(tfId);
		add(lpwd); add(tfPwd);
		add(ok); 
		
		setSize(450, 80);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ActionEvent_6("ActionEvent_6(Login) Test~~");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String id = tfId.getText();
		String password = tfPwd.getText();
		
		if (!id.equals("korea")) {
			System.out.println("입력하신 ID 가 존재하지 않습니다");
			tfId.requestFocus();
			tfId.selectAll();
		}
		
		else if (!password.equals("seoul")) {
			System.out.println("입력하신 password가 존재하지 않습니다");
			tfPwd.requestFocus();
			tfPwd.selectAll();
			
		}
		
		else {
			System.out.println(id  + "님 로그인 되었습니다.");
		}
	}
	
}
