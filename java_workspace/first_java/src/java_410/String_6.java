package java_410;

public class String_6 {
	public static void main(String[] args) {
		
		String[] juju = {"7312231622314",
						"8001222365432",
						"9011231234567",
						"9705052345678",
						"9903211234567",
						"9812122345678"};
		
//		String str = "자바는 정말 재미있습니다.";
		
		
		// .substring(int i, int j) => i : 시작 인덱스, j : 끝 인덱스
//		System.out.println(str.substring(1));			
//		System.out.println(str.substring(4,7));

		
//		for (int i = 0; i < juju.length; i++) {
//			if (juju[i].substring(6,7).equals("1")) {
//				System.out.println(juju[i] + " 남자입니다.");		
//			}
//			else {
//				System.out.println(juju[i]+ " 여자입니다.");
//			}
//		}
		
		for (int i = 0; i < juju.length; i++) {
			
			if (juju[i].indexOf("1",6) == 6 || juju[i].indexOf("3",6) == 6) {
				System.out.println(juju[i] + " 남자");
			}
			else {
				System.out.println(juju[i] + " 여자");
			}
		}
		
		
	}
}
