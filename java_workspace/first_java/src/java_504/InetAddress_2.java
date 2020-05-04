package java_504;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class InetAddress_2 {
	public static void main(String[] args) throws Exception{
		
		String url = null;
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("웹 사이트이름을 입력하세요 ");
		url = read.readLine();
		
		InetAddress addr = InetAddress.getByName(url);	// 도메인명을 입력
		
		System.out.println("===============================");
		System.out.println(url + " => " + addr.getHostAddress()); // 도메인명에 해당하는 IP주소를 가져올수있음
		
		
	}
}
