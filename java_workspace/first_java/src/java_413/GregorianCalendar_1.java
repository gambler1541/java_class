package java_413;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregorianCalendar_1 {
	public static void main(String[] args) {
		
		GregorianCalendar gcal = new GregorianCalendar();
		
		prn("���� ��¥�� �ð� \n");
		prn(gcal.get(Calendar.YEAR) + "��");
		prn((gcal.get(Calendar.MONTH )+ 1) + "��");
		prn(gcal.get(Calendar.DATE) + "��");
		
		if (gcal.isLeapYear(1992)) {
			
			// isLeapYear()	: �����̸� true ��ȯ
			prn("\n ���� �Դϴ�.~~~");
		}
		else { 
			prn("\n ��� �Դϴ�.@@@");
		}
	}

	private static void prn(String str) {
		System.out.println(str);
	}
}
