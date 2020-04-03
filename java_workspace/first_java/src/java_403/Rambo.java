package java_403;

interface Knife{
	public void wield();
	
}

interface Bow{
	public void shoot_bow();
}

interface Gun{
	public void shoot_gun();
}


interface Rambo_1 extends Knife, Bow, Gun
{
	public void punch();
}



class Myengbae implements Rambo_1{
	
	String name;
	
	public Myengbae(String name) {
		this.name = name;
	}
	@Override
	public void wield() {
		System.out.println(this.name + " Į�� �ֵθ���");
	}

	@Override
	public void shoot_bow() {
		System.out.println(this.name +" Ȱ�� ���");
	}

	@Override
	public void shoot_gun() {
		System.out.println(this.name +" ���� ���");
		
	}
	@Override
	public void punch() {
		System.out.println(this.name + " �ָ����� �Ѵ�");
		
	}
	
}

public class Rambo {
	public static void main(String[] args) {
		
		Rambo_1 obj = new Myengbae("�ڸ��");	// �����ڵ� �޼ҵ�
	
//		obj.name;	// Rambo_1 Ÿ���̱⶧���� ������ ��������
		
		obj.shoot_bow();
		obj.shoot_gun();
		obj.wield();
		obj.punch();
	}
}
