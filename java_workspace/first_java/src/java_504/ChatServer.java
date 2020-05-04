package java_504;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ChatServer extends Frame implements ActionListener{

	Button btn_ext; // ���� ��ư
	TextArea txt_list; // ���� ��� ���
	protected Vector list; // ������ ���� ��� ����

	public ChatServer(String title) {
		super(title);
		list = new Vector(); // ���� ����
		btn_ext = new Button("���� ����");	// �������� ��ư
		btn_ext.addActionListener(this); // �̺�Ʈ ���
		txt_list = new TextArea(); //txt_list ����
		add("Center", txt_list);// ȭ�� ��� txt_list ���
		add("South", btn_ext);// ȭ�� �ϴܿ� ���� ���� ��ư ���
		setSize(200, 200);// ȭ�� ũ�� ����
		setVisible(true);// ȭ�� ���
		ServerStart();// ä�ü��� ����
	}

	public void ServerStart() {
		final int port = 1111; // ä�� ���� ��Ʈ ��� ����
		try {
			ServerSocket ss= new ServerSocket(port); // ServerSocket
			while (true) {
				Socket client = ss.accept(); // Ŭ���̾�Ʈ ������ ��ٸ�
				txt_list.append(client.getInetAddress().getHostAddress() + "\n");
				ChatHandler ch = new ChatHandler(this, client); //ChatHandler �ʱ�ȭ
				list.addElement(ch); // Ŭ���̾�Ʈ ���� list ���� �߰�
				ch.start();
			}
		}catch (Exception e) { //����ó��
			System.out.println(e.getMessage());
		}
	}
	// ���� ���� ��ư�� ��������
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

	// �޽��� ��� �޼���
	public void setMsg(String msg) {
		txt_list.append(msg + "\n"); // ȭ�鿡 msg �޽��� ���
	}

	// main �޼���
	public static void main(String[] args) {
		new ChatServer("Server chat");
	}
}
// ChatHandler Ŭ����
class ChatHandler extends Thread{

	ChatServer server = null; // GUICahtServer ��� ����
	Socket client = null;	// ������ Ŭ���̾�Ʈ
	BufferedReader br = null;	// �о����
	PrintWriter pw = null;		// ������

	// ������
	public ChatHandler(ChatServer server, Socket client) throws IOException {
		this.server = server;
		this.client = client;
		// ����� ��Ʈ�� ����
		InputStream is = client.getInputStream();
		br = new BufferedReader(new InputStreamReader(is));
		OutputStream os = client.getOutputStream();
		pw = new PrintWriter(new OutputStreamWriter(os));
	}

	public void Send_All(String msg) {
		try {
			synchronized (server.list) { // ChatServer ��� ���� list
				int size = server.list.size(); // ���� ������ Ŭ���̾�Ʈ
				for (int i = 0; i < size; i++) {
					ChatHandler chs = (ChatHandler)server.list.elementAt(i);
					synchronized (chs.pw) {// ChatHandler pw �ν��Ͻ��� �̿��� ���� ����
						chs.pw.println(msg);
					}
					chs.pw.flush();
				}
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// Thread Ŭ������ run �޼��� �������̵�
	@Override
	public void run() {
		String name = "";
		try {
			name = br.readLine();
			Send_All(name + " ���� ���� �����ϼ̽��ϴ�.");
			while (true) {
				String msg = br.readLine();
				String str = client.getInetAddress().getHostName();
				synchronized (server) {
					server.setMsg(str + " : " + msg); // ���� Ŭ���̾�Ʈ �޽���  ���
				}
				if (msg.equals("@@Exit")) // @@Exit �޽����� Ŭ���̾�Ʈ ���� ����
					break;
				else // ���� ������ ��� Ŭ���̾�Ʈ�� �޽��� ����
					Send_All(name + " >> " + msg);
			}
		}catch (Exception e) {
			server.setMsg(e.getMessage());
		}finally {
			synchronized (server.list) {
				server.list.removeElement(this);
			}
			try { // ��Ʈ�� ����
				br.close();
				pw.close();
				client.close();	// Ŭ���̾�Ʈ ���� ����
			}catch (IOException e) {		//����ó��
				System.out.println(e.getMessage());
			}
		}
		
	}

}