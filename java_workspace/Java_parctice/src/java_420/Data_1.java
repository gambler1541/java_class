package java_420;


class Data{
	int x;
}


public class Data_1 {
	public static void main(String[] args) {
		Data d = new Data();
		Object obj = new Data();
		
		if (d instanceof Data) {
			System.out.println("d는 Data의 객체이다");
		}
		else {
			System.out.println("아니다");
		}
		
		if (obj instanceof Data) {
			System.out.println("d는 Data의 객체이다");
		}
		else {
			System.out.println("아니다");
		}
	}
	
}
