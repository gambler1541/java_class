public class InputOutput
 {
	 <!-- .read()�޼��� ���� ����ó���� �ʼ�-->
  public static void main(String[] args) throws Exception

   {
    int a;
	while (true){

		System.out.print("���ڸ� �Է��ϼ���!! ");
		<!-- .read()�޼���� �Է� ���� �ϳ��� �ڷῡ ���� ascii code�� return ����   -->
		a = System.in.read();
		<!-- ���� �Է��ϸ�(enter) �Է� ���� Enter�� ascii(13,11) code�� read()�޼��忡 ���� �Էµ�  -->
		System.in.read();
		System.in.read();
		
		System.out.println("�Է��� ���ڴ�" +(char)a +"�Դϴ�.");
		System.out.println("Ascii Code : " + a + "�Դϴ�.");
	
		}	
	}
 }