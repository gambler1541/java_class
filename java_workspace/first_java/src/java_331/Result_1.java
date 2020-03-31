package java_331;


class Grade
{
	int kor = 60;
	int eng = 60;
	int math = 60;
		
}


public class Result_1 {
	public static void main(String[] args) {
		
		int total1, total2, total3;
		double avg1, avg2, avg3;
		
		Grade grade_1 = new Grade();
		//Grade grade_2 = grade_1;
		Grade grade_2 = new Grade();
		
		
		
		grade_1.kor = 78;
		grade_2.eng = 999;
		
		total1 = grade_1.kor + grade_2.eng + grade_2.math;
		total2 = grade_2.kor + grade_2.eng + grade_2.math;
		total3 = grade_1.kor + grade_1.eng + grade_1.math;
		
		
		avg1 = total1 / 3.0;
		avg2 = total2 / 3.0;
		avg3 = total3 / 3.0;
		
		System.out.println(" total1 total: "+total1+"\ttotal1 avg: "+avg1);
		System.out.println(" total2 total: "+total2+"\ttotal2 avg: "+avg2);
		System.out.println(" total3 total: "+total2+"\ttotal3 avg: "+avg3);
		
		
		
	}
}
