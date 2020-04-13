package java_413;

import java.util.StringTokenizer;

public class StringTokenizerTet {
	public static void main(String[] args) {
		
		String str = "자바는 다양한 문자열 처리,날짜 처리," + 
					 "시간 처리를, 위한 메소드를 갖고 있습니다.";
		
		StringTokenizer stt = new StringTokenizer(str, "를");
		
		System.out.println("토큰 '를' 의 갯수 : " + stt.countTokens() + " 개 \n");
		
		while (stt.hasMoreTokens()) {
			System.out.println(stt.nextElement());
		}
		
		
	}
}
