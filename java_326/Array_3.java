public class Array_3
{
	public static void main(String[] args) 
	{
		
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};

/*		for (int i = 0;i < month.length ; i++ )
		{
			System.out.println((i + 1)+ "����" + month[i]+"��");
		}

*/

														// ���� for ��(�迭�̳� �÷��ǿ����� ����)
		for (int ss : month )				// �迭 month�� ��� ��Ҹ� ss�� �Ҷ�
		{												// month => �ݺ��� ���
			System.out.println(ss);		// ss�� �ǹ��ϴ� ������ ���� ���
		}
	}
}
