public class Array_12 
{
	public static void main(String[] args) 
	{
		if (args.length != 3)
		{
			System.out.println("usage : java Array_12 NUM1 op NUM2 "); // 만약 n (연산자) x 의 형식이 틀렸을 때 사용법을 알려줌 
			System.exit(0);		// 프로그램을 종료 시킴
		}
		int num1 = Integer.parseInt(args[0]);		// 문자를 숫자로 변환
		char op  =args[1].charAt(1);						// 문자열을 문자(char)로 변환(문자열 중 맨 앞(0)에 있는 문자를 가져옴)
		int num2 = Integer.parseInt(args[2]);

		int result = 0;

		switch (op)
		{
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case 'x':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case 'X':
			result = num1 % num2;
			break;
		default:
			System.out.println("지원되지 않는 연산자 입니다.");
		}
	
		System.out.println(" 결과 : " + result);
	}
}
