package java_408;

class ATM{
	private int total;
	
	public ATM(int total) {
		this.total = total;
	}
	
	synchronized void deposit(int amount, String name) {			// synchronized => ������ �� �޼ҵ带 ����Ѵٸ� �ٸ������ ����Ҽ�����
		total += amount;
		System.out.println(name + " �� �Ա� �ݾ�" + amount + "��");
	}
	
	synchronized void withdraw(int amount, String name) {
		if ((total - amount) > 0) {
			total -= amount;
			System.out.println(name + " �� ��� �ݾ� " + amount + "��");
		}
		else {
			System.out.println(name + " �� �ܾ��� ������ ����� �� �����ϴ�.");
		}
	}
	public void getTotal() {
		System.out.println("\n ���� ������ �ܾ� : " + total + "\n");
	}
}


class ATM_USER extends Thread {
	
	boolean flag = false;		// ��� / �Ա� �ݺ�
	ATM obj;
	
	public ATM_USER(ATM obj, String name) {
		super(name);
		this.obj = obj;
	}
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if (flag) {
				obj.deposit((int)(Math.random() * 10000), getName());
				obj.getTotal();
			}
			else {
				obj.withdraw((int)(Math.random() * 10000), getName());
				obj.getTotal();
			}
			
			flag = !flag;
			
		} 
	}
	
}


public class MyAtm {
	public static void main(String[] args) {

//		ATM atm = new ATM(10000);	// ���¿� 10000���� ��� ����
//		
//		ATM_USER user1 = new ATM_USER(atm, "�̳���");
//		ATM_USER user2 = new ATM_USER(atm, "Ȳ����");
//		ATM_USER user3 = new ATM_USER(atm, "��濵");
//		
		
	
	
//		user1.start();
//		user2.start();
//		user3.start();
//		
		
	}

	
}

