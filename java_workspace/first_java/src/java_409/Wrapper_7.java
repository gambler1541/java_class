package java_409;

public class Wrapper_7 {
	public static void main(String[] args) {
		
		char[] obj = new char[args[0].length() + 1];
		
		args[0].getChars(0, args[0].length(), obj, 0);
		
		for (int i = 0; i < obj.length; i++) {
			
			System.out.println("\t 입력된 문자[" +obj[i] +"]");
			
			if (Character.isDefined(obj[i])) {
				System.out.println("\t 유니코드입니다.");
			}

			if (Character.isLetter(obj[i])) {
				System.out.println("\t 문자 입니다.");
			}
			
			if (Character.isDigit(obj[i])) {
				System.out.println("\t 숫숫자 입니다.");
			}
			System.out.println();
			
		}
		
		for (int i = 0; i < obj.length; i++) {
			System.out.print(obj[i]);
		}
		
		
	}
}
