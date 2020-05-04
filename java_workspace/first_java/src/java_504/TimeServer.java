package java_504;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class TimeServer {
	public static void main(String[] args) {
		int port = 7777;
		
		try {
			ServerSocket sos = new ServerSocket(port);
			
			while (true) {
				Socket client = sos.accept(); // 서버는 클라이언트가 연결하기를 기다리고 있고 연결이 되면 새로운 Socket객체를 생성하여 반환한다.
				OutputStream os = client.getOutputStream(); // 서버는 OutputStream을 통하여 클라이언트에 정보를 보낸다.
				ObjectOutputStream oos = new ObjectOutputStream(os);
				
				oos.writeObject(new Date());	// 현재 시간 보내기
				oos.flush();
				oos.close();
				client.close();
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
