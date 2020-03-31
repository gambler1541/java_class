package java_331;


class Info
{
	private String name;	// 멤버 변수	이름 기본값 : null
	private int age;		// 			나이 기본값 : 0		
	private char sex;		// 성별
	private String tel;
	private String address;
//
//	public Info(String n, int a, char s, String tel, String address) {		// 생성자
//		name = n;
//		age = a;
//		sex = s;
//		this.tel = tel;
//		this.address = address;
//	}
//	
	
	public void display()		// 메서드
	{

		System.out.println("이름:  " + name);
		System.out.println("나이:  " + age);
		
		if (sex == 'f') {
			System.out.println("성별:  " + sex + " 여성 입니다.");
		}
		else if(sex == 'm')
		{
			System.out.println("성별:  " + sex + " 남성 입니다.");
		}
		else
		{
			System.out.println("성별: 사람이 아닙니다.");
		}
		System.out.println("번호 : " + tel);
		System.out.println("주소 : " + address);
		
		
	}
		
}

public class InfoExe {
	public static void main(String[] args) {
		
		
	
//		Info info1 = new Info("수선화", 20, 'f', "010-4548-4844","서울 관악구 신림동");		// info1 초기화 (name = 수선화, age = 20, sex = f)
//		Info info2 = new Info("목련", 15, 'm', "010-4471-0242", "부산 사하구 장림동 ");		// info2 초기화(name = 목련, age = 15, sex =m)
//		Info info3 = new Info("한국", 15, 't', "010-3121-1114","서울 강남구 강남동");		// info2 초기화
		
		Info info1 = new Info();
		Info info2 = new Info();
		Info info3 = new Info();
		
		
		info1.display();	// info1 화면 출력
		System.out.println();
		info2.display();	// info2 화면출력
		System.out.println();
		info3.display();	// info3 화면출력
		
	}
}
