class Char_2 
{
	public static void main(String[] args) 
	{
		char single = '\'';	//  '문자 표현
		char single_2 = '\\'; // \ 문자표현 
		char single_3 = '\141'; // 8진수 숫자
		char single_4 = '\u00aa'; // 16 숫자
		char single_5 = '\t'; // Tab 키


		System.out.println("표현된 값:  " + single);
		System.out.println("표현된 값:  " + single_2);
		System.out.println("표현된 값:  " + single_3);
		System.out.println("표현된 값:  " + single_4);
		System.out.println("표현된 값:  " + single_5);

	}
}
