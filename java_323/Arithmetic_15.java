public class Arithmetic_15
{
	public static void main(String[] args) throws Exception
	{
		int ch, upper, lower;

		System.out.print("���ĺ��� �Է��ϼ���: ");
		ch = System.in.read();

		if (ch >= 'A' && ch <= 'Z')
		{
			lower = ch | 0x20; // ��Ʈ �ڸ����� 32�� ���Ѱ�(Or������ ����)
			System.out.println((char)ch + "�� �ҹ���: " +(char)lower);
		}
		else
			{
			 upper = ch & 0xDF; // And������ ����( - )
			 System.out.println((char)ch + "�� �빮��: " + (char)upper);

			}
	}
}
