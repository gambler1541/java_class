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
			
			System.out.println("서버 타임 시간 받아오기....");
			System.out.println("서버 아이피 입력: ");
			server_ip = read.readLine();
			
			Socket client = new Socket(server_ip, port); // 서버는 port번호로만 열기 가능
														 // 클라이언트는 서버의 IP address, port번호를 둘다 알아야함
			InputStream is = client.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			date = (Date)ois.readObject();
			
			System.out.println("현재 시간: " + date);
			ois.close();
			client.close();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
