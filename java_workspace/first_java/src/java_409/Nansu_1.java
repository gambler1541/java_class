package java_409;

public class Nansu_1 {
	public static void main(String[] args) {
		
		int xxx = 34; // ���Ѱ�
		int yyy = 77; // ���Ѱ�
		
		int count = 0;
		
		
		// ���� �߻� ���� : (����ȭ)((���Ѱ� - ���Ѱ� + 1) * ���� + ���Ѱ�)
		
		System.out.println(xxx + "~ " + yyy + " ���� ���� �߻�  \n");
		
		
		for (int i = 0; i < 100; i++) {
			System.out.print((int)((yyy-xxx + 1)* Math.random()) + (xxx) + " ");
			
			count ++;
			
		
			if (count % 5 == 0) {
				System.out.println();
			}
		}
	}
}
