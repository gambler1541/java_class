package java_408;

class ATM{
	private int total;
	
	public ATM(int total) {
		this.total = total;
	}
	
	synchronized void deposit(int amount, String name) {			// synchronized => 누군가 이 메소드를 사용한다면 다른사람은 사용할수없음
		total += amount;
		System.out.println(name + " 님 입금 금액" + amount + "원");
	}
	
	synchronized void withdraw(int amount, String name) {
		if ((total - amount) > 0) {
			total -= amount;
			System.out.println(name + " 님 출금 금액 " + amount + "원");
		}
		else {
			System.out.println(name + " 님 잔액이 부족해 출금할 수 없습니다.");
		}
	}
	public void getTotal() {
		System.out.println("\n 현재 계좌의 잔액 : " + total + "\n");
	}
}


class ATM_USER extends Thread {
	
	boolean flag = false;		// 출금 / 입금 반복
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

//		ATM atm = new ATM(10000);	// 계좌에 10000원이 들어 있음
//		
//		ATM_USER user1 = new ATM_USER(atm, "이낙연");
//		ATM_USER user2 = new ATM_USER(atm, "황교안");
//		ATM_USER user3 = new ATM_USER(atm, "허경영");
//		
		
	
	
//		user1.start();
//		user2.start();
//		user3.start();
//		
		
	}

	
}

