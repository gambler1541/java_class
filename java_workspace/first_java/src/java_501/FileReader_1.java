package java_501;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class FileReader_1 {
	public static void main(String[] args) throws Exception{
		
		int i = 0;
		
		String file;
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("읽어올 파일 이름을 입력하세요 ! ");
		file = read.readLine();
		
		System.out.println(file + " 문서 내용 ********************** ");
		
		FileReader frr = new FileReader(file);
		
		while ((i = frr.read()) != -1) {	// 값이 없다면 -1 리턴
			System.out.print((char) i );
		}
		frr.close();
	}
}
