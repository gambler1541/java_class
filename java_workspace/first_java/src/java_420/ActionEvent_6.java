package java_420;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEvent_6 extends Frame implements ActionListener{
	
	Label lid, lpwd, lphone;
	TextField tfId, tfPwd, tfPhone;
	Button ok;
	
	public ActionEvent_6(String title) {
		super(title);
		
		lid = new Label("ID : ", Label.RIGHT);
		lpwd = new Label("PWD : ", Label.RIGHT);
		lphone = new Label("Phone : ", Label.RIGHT);
		
		tfId = new TextField(10);
		tfPwd = new TextField(10);
		tfPhone = new TextField(12);
		
		tfPwd.setEchoChar('*');
		ok = new Button("OK");
		
		tfId.addActionListener(this);
		tfPwd.addActionListener(this);
		tfPhone.addActionListener(this);
		ok.addActionListener(this);
		
		setLayout(new FlowLayout());
		
		add(lid); add(tfId);
		add(lpwd); add(tfPwd);
		add(lphone); add(tfPhone);
		add(ok); 
		
		setSize(650, 80);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ActionEvent_6("ActionEvent_6(Login) Test~~");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String id = tfId.getText();
		String password = tfPwd.getText();
		String phone = tfPhone.getText();
		
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
		
		else if(!phone.equals("01011112222")) {
			System.out.println("입력하신 phone은 존재하지 않습니다");
			tfPhone.requestFocus();
			tfPhone.selectAll();
			
		}
		
		else {
			System.out.println(id  + "님 로그인 되었습니다.");
		}
	}
	
}
