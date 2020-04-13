package java_413;

import java.util.Calendar;
import java.util.Date;

public class Calendar_2 {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		
		prn(" 오늘은 : " + date);
		prn("오늘은 올해의 " + cal.get(Calendar.DAY_OF_YEAR) + " 날 입니다.");
		prn("오늘은 이번주의 " + cal.get(Calendar.DAY_OF_WEEK) + " 일 입니다.");
		prn("오늘은 올해의 " + cal.get(Calendar.WEEK_OF_YEAR) + " 주 입니다.");
		prn("오늘은 달의 " + cal.get(Calendar.DAY_OF_MONTH) + " 일 입니다.");
		
	}

	private static void prn(String str) {
		System.out.println(str);
	}
}
