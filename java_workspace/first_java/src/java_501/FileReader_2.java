package java_501;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_2 {
	public static void main(String[] args) {
		try {
			//파일 객체 생성
			File file = new File("../../../kbs/aaa.txt");
			
			// 입력 스트림 생성
			FileReader filereader = new FileReader(file);
			
			// 입력 버퍼 생성
			BufferedReader bufReader = new BufferedReader(filereader);
			String line = "";
			
			//한줄씩 읽기
			while ((line = bufReader.readLine()) != null) {
				System.out.println(line);
			}
			//.readline()은 끝에 개행 문자를 읽지 않는다.
			bufReader.close();
		}catch (FileNotFoundException e) {
		}catch (IOException e) {
			System.out.println(e);
		}
	}
}
