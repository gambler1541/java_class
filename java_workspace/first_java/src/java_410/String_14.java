package java_410;

public class String_14 {
	public static void main(String[] args) {
		
		int[] str = {5123236,32432,7,89,38,424124,1,6565,234};
		
		System.out.println("************정렬 전 수행 문자열*****************");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + "\t");
		}
		System.out.println();
		System.out.println("************정렬 후후 수행 문자열****************");
		
		for (int i = 0; i < str.length -1; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if (str[i] < str[j]) {
					int temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}

		
		for (int i = 0; i < str.length; i++) {
			System.out.printf("%d\t", str[i]);
		}
	}
}































