package java_410;

public class String_2 {
	public static void main(String[] args) {
		
		int ii = 77;
		float ff = 45.78f;
		
		String str = "점수 : ";
		
		System.out.println(str + ii + ff);					// 문자열 + 숫자의 연산은 문자열화
		System.out.println(""+2 + 0 + 2 + 0 + "코로나19");		// 숫자 + 문자열은 숫자 + 문자열(좌 -> 우로 연산이 실행) 
		System.out.println("국회의원 선거 : "+ 2 + 0 + 2 + 0 );	// 문자열 + 숫자의 연산
	}
}
