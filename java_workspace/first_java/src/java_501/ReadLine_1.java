package java_501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLine_1 {
	public static void main(String[] args) throws IOException {
		
		String name = null;
		String addr = null;
		String num = null;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// BufferdReader Ŭ������ ��ü reader�� �����մϴ�.
		// System.in.read()�� �� ���ھ� ����Ʈ�� �Է¹ޱ� ������
		// ���ڿ��� �����ؾ� �մϴ�.
		// InputStreamReader Ŭ������ ����Ʈ ���� �Է� ��Ʈ���� ���� ���� �Է� ��Ʈ������ �����մϴ�.
		// ���ڿ��� ȿ�������� ó���ϱ� ���� BufferedReaderŬ������ ��ü�� �̿��ϸ�
		// ����ڰ� �Է��� ���ڿ��� ���� �Է� ���� �� �ֽ��ϴ�.
		// ���ڿ��� �Է� �ޱ� ���� BufferedReader Ŭ������ ����մϴ�.
		
		System.out.println("�̸��� �Է� �ϼ��� ! ");
		name = reader.readLine();
		System.out.println("�ּҸ� �Է� �ϼ��� ! ");
		addr = reader.readLine();
		System.out.println("��ȭ��ȣ�� �Է� �ϼ��� ! ");
		num = reader.readLine();
		
		System.out.println(name + " �� �ݰ����ϴ�. ����� " + addr + "�� ��� �ְ� ��ȭ��ȣ�� " + num +" �Դϴ�." );
		
	}
}
