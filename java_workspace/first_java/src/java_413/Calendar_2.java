package java_413;

import java.util.Calendar;
import java.util.Date;

public class Calendar_2 {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		
		System.out.println(" ������ : " + date);
		System.out.println("������ ������ " + cal.get(Calendar.DAY_OF_YEAR) + " �� �Դϴ�.");
		System.out.println("������ �̹����� " + cal.get(Calendar.DAY_OF_WEEK) + " �� �Դϴ�.");
		System.out.println("������ ������ " + cal.get(Calendar.WEEK_OF_YEAR) + " �� �Դϴ�.");
		System.out.println("������ ���� " + cal.get(Calendar.DAY_OF_MONTH) + " �� �Դϴ�.");
		
	}
}
