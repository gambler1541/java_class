package java_413;

import java.util.Calendar;

public class Calendar_1 {
	public static void main(String[] args) {
		
		Calendar cal_1 = Calendar.getInstance();	// singleton pattern(�̱����̶� � Ŭ������ ���� �ѹ��� �޸𸮸� �Ҵ��ϰ�(Static)
													// �� �޸𸮿� ��ü�� ����� ����ϴ� ������ ����)
		
		System.out.println("Calendar Ŭ������ �̿��� �ð��� ����");
		
		System.out.print(cal_1.get(Calendar.YEAR) + " �� ");
		System.out.print(cal_1.get(Calendar.MONTH) + 1 + " �� ");	// MONTH�� index 0�� ���� ���۵�
		System.out.print(cal_1.get(Calendar.DATE) + " �� ");
		System.out.print(cal_1.get(Calendar.HOUR) + " �� ");
		System.out.print(cal_1.get(Calendar.MINUTE) + " �� ");
		System.out.print(cal_1.get(Calendar.SECOND) + " �� ");
		
	}
}
