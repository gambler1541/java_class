package java_413;

import java.util.Calendar;
import java.util.Date;

public class Calendar_2 {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		
		prn(" ������ : " + date);
		prn("������ ������ " + cal.get(Calendar.DAY_OF_YEAR) + " �� �Դϴ�.");
		prn("������ �̹����� " + cal.get(Calendar.DAY_OF_WEEK) + " �� �Դϴ�.");
		prn("������ ������ " + cal.get(Calendar.WEEK_OF_YEAR) + " �� �Դϴ�.");
		prn("������ ���� " + cal.get(Calendar.DAY_OF_MONTH) + " �� �Դϴ�.");
		
	}

	private static void prn(String str) {
		System.out.println(str);
	}
}
