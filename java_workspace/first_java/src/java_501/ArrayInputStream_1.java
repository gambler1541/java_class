package java_501;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ArrayInputStream_1 {
	public static void main(String[] args) {
		
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		// ByteArrayInputStream : 바이트 배열에 데이터를 입출력하는데 사용되는 스트림
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		int data = 0;
		
		while ((data = input.read()) != -1) {
			output.write(data);
		}
		outSrc = output.toByteArray();
		
		System.out.println("Input Source  : " + Arrays.toString(inSrc));
		System.out.println("Output Source :" + Arrays.toString(outSrc));
	}
}
