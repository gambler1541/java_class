public class ShiftTest_1 
{
	public static void main(String[] args) 
	{
		// 20 ������ 3��° ��Ʈ�� �����ΰ���
		// 20 = 0001 0100(10100)

		int num = 20;
		num = num >> 2;
		num = num & 1;

		System.out.println("20�� 3��° ��Ʈ��: " + num);
	}
}