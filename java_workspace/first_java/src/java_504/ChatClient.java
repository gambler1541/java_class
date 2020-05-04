package java_504;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient extends Frame implements ActionListener, Runnable{
	
	Button btn_exit; // �����ư
	Button btn_send; // ���۹�ư
	Button btn_connect; // ���� ����
	TextArea txt_list; // ���� ��� ���
	TextField txt_server_ip; // ���� ���� ip
	TextField txt_name; //���� �̸�
	TextField txt_input; // ���� �޽���
	Socket client; // ���� Ŭ���̾�Ʈ ����
	BufferedReader br = null; //�о���� ��Ʈ��
	PrintWriter pw = null; // ������ ��Ʈ��
	String server_ip = null; // ���� ������
	final int port = 9999; // ��Ʈ����ȣ
	
	CardLayout cl; // ī�巹�̾ƿ� ����
	
	public ChatClient(String title) { // ������
		super(title); // Ÿ��Ʋ�� ����
		
		cl = new CardLayout(); // ī�� ���̾ƿ� �ʱ�ȭ
		setLayout(cl); // ���̾ƿ� ����
		Panel connect = new Panel(); // ���� ȭ��
		Panel chat = new Panel(); // ä�� ȭ��
		chat.setLayout(new BorderLayout());
		connect.setLayout(new BorderLayout());
		
		btn_connect = new Button("���� ����");
		btn_connect.addActionListener(this); // �̺�Ʈ ���
		txt_server_ip = new TextField("192.168.0.31", 15); // 192.168.0.90,  127.0.0.1
		txt_name = new TextField("�ڸ��", 15);
		Panel connect_sub = new Panel(); // ����â ���� �г�
		connect_sub.add(new Label("����  ������ : "));
		connect_sub.add(txt_server_ip);
		connect_sub.add(new Label("��ȭ��         :"));
		connect_sub.add(txt_name);
		connect.add("North", new Label("���� ä�� ���� ȭ��",Label.CENTER));
		connect.add("Center", connect_sub);
		connect.add("South", btn_connect);
		
		//ä��â ȭ�� ����
		txt_list = new TextArea();
		txt_input = new TextField("", 25);
		btn_exit = new Button("����");
		btn_send = new Button("����");
		btn_exit.addActionListener(this);
		btn_send.addActionListener(this); // �̺�Ʈ ���
		txt_input.addActionListener(this);
		Panel chat_sub = new Panel(); // ä��â ���� �г�
		chat_sub.add(txt_input);
		chat_sub.add(btn_send);
		chat_sub.add(btn_exit);
		chat.add("North", new Label("ä�� ���α׷� ver 1.0", Label.CENTER));
		chat.add("Center", txt_list);
		chat.add("South", chat_sub);
		
		add(connect, "����â"); // ī�� ���̾ƿ��� ���
		add(chat, "ä��â");	  // ī�� ���̾ƿ��� ���
		
		cl.show(this, "����â"); // �ʱ�ȭ���� ����â
		
		setSize(400, 300);
		setVisible(true);
	}
	// ActionEvent �̺�Ʈ ó��
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			Object obj = e.getSource();
			// ���� ���� ��ư�� ��������
			if (obj == btn_connect) {
				server_ip = txt_server_ip.getText();
				Thread th = new Thread(this);
				th.start(); // ������ ����
				cl.show(this, "ä��â"); // ä��â���� ȭ�� ��ȯ
			}
			// ���� ��ư�� ������ ��
			else if (obj == btn_exit) {
				System.exit(0); //���α׷� ���� ����
			}
			else if ((obj == btn_send) || (obj == txt_input) ) {
				// ���۹�ư�� ��������
				// �� �Է� ���ڿ��� ����Ű�� ������
				String msg = txt_input.getText();
				pw.println(msg);
				pw.flush();
				txt_input.setText("");
				txt_input.requestFocus();
			}
		
		}catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
	}


	@Override
	public void run() {
		try {
			client = new Socket(server_ip, port); // ���ϻ���
			// ����� ��Ʈ�� ����
			InputStream is = client.getInputStream();
			OutputStream os = client.getOutputStream();
			br = new BufferedReader(new InputStreamReader(is));
			pw = new PrintWriter(new OutputStreamWriter(os));
			String msg = txt_name.getText();
			pw.println(msg); // ��ȭ�� ����
			pw.flush();
			txt_input.requestFocus();// ä��â �� �Է� ���ڿ� ��Ŀ��
			
			while (true) {
				msg = br.readLine();
				txt_list.append(msg + "\n");
			}
		}catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		new ChatClient("Chat Client");
	}
}
