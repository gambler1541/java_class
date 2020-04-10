package Atm;

class Atm_1 { 
	private int total;
	
	public Atm_1(int money) {
		total += money;
	}
	
	synchronized public void deposit(String name, int amount) {
		total += amount;
		System.out.println(name + "����" + amount + "�� �Ա��߽��ϴ� �ܾ���: " + total);
	}
	
	synchronized public void withdraw(String name, int amount) {
		if ((total-amount) < 0) {
			System.out.println("�ܾ��� �����ϴ�");
		}
		else {
			total -= amount;
			System.out.println(name + "����" + amount + "�� ����߽��ϴ� �ܾ���: " + total);
		}
	}
	
	public void getTotal() {
		System.out.println(total);
	}
	
}


class AtmUser extends Thread{
	Atm_1 atm;
	boolean flag = false;
	
	
	public AtmUser(String name, Atm_1 atm) {
		super(name);
		this.atm = atm;
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int money = (int) (Math.random() * 10000);
			if (flag) {
				atm.deposit(getName(), money);
			} else {
				atm.withdraw(getName(), money);
			} 
			
			flag = !flag;
		}
	}
}

public class Atm {
	public static void main(String[] args) {
		Atm_1 atm = new Atm_1(10000);
		
		AtmUser user1 = new AtmUser("ȫ�浿", atm);
		AtmUser user2 = new AtmUser("����", atm);
		AtmUser user3 = new AtmUser("������", atm);
		
		
		user1.start();
		user2.start();
		user3.start();
	}
}
