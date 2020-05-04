package java_504;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

public class TimeClient {
	public static void main(String[] args) {
		
		String server_ip;
		Date date = null;
		int port = 7777;
		try {
			BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("���� Ÿ�� �ð� �޾ƿ���....");
			System.out.println("���� ������ �Է�: ");
			server_ip = read.readLine();
			
			Socket client = new Socket(server_ip, port); // ������ port��ȣ�θ� ���� ����
														 // Ŭ���̾�Ʈ�� ������ IP address, port��ȣ�� �Ѵ� �˾ƾ���
			InputStream is = client.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			date = (Date)ois.readObject();
			
			System.out.println("���� �ð�: " + date);
			ois.close();
			client.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
