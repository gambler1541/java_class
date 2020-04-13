package java_413;

import java.util.Calendar;

public class Calendar_3 {
	public static void main(String[] args) {
		
		Calendar cal_1 = Calendar.getInstance();
		Calendar cal_2 = Calendar.getInstance();
		
		cal_1.set(2020, 03, 16);
		cal_2.set(2020, 03, 15);
		
		
		if (cal_1.after(cal_2)) {
			System.out.println("현재 시간은 2020, 03, 15 후 일 입니다.");
		}
		else if(cal_1.before(cal_1)) { 
			
			System.out.println("현재 시간은 2020, 03, 15 전 일 입니다.");
		}
		else {
			System.out.println("현재 시간은 2020, 03, 15 일 입니다.");
		}
	}
}
