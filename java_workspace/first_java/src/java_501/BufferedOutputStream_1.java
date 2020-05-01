package java_501;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Date;

public class BufferedOutputStream_1 {
	public static void main(String[] args) throws Exception{
		
		String file, str;
		
		Date date = new Date();
		
		str = " 파일 생성 시간  박명배 : \r\n" + date + "\r\n";
		
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("파일 이름 : ");
		file = read.readLine();
		
		System.out.println("저장할 문자열 !!!!!");
		str += read.readLine();
		
		byte[] byte_str = str.getBytes();
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		bos.write(byte_str);
		bos.close();
		
		System.out.println(file + "에 성공적으로 저장  하였습니다.");
	}
}
