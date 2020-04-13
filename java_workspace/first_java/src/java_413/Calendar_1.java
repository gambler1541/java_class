package java_413;

import java.util.Calendar;

public class Calendar_1 {
	public static void main(String[] args) {
		
		Calendar cal_1 = Calendar.getInstance();	// singleton pattern(싱글톤이란 어떤 클래스가 최초 한번만 메모리를 할당하고(Static)
													// 그 메모리에 객체를 만들어 사용하는 디자인 패턴)
		
		System.out.println("Calendar 클래스를 이용한 시간과 날자");
		
		System.out.print(cal_1.get(Calendar.YEAR) + " 년 ");
		System.out.print(cal_1.get(Calendar.MONTH) + 1 + " 월 ");	// MONTH는 index 0번 부터 시작됨
		System.out.print(cal_1.get(Calendar.DATE) + " 일 ");
		System.out.print(cal_1.get(Calendar.HOUR) + " 시 ");
		System.out.print(cal_1.get(Calendar.MINUTE) + " 분 ");
		System.out.print(cal_1.get(Calendar.SECOND) + " 초 ");
		
	}
}
