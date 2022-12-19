package test.ch06.test;

public class Account {
	private int balance; //잔고
	public static final int MIN_BALANCE = 0; //상수
	public static final int MAX_BALANCE = 1000000;
	
	
	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) { //코딩은 위에서부터 차례로 실행되므로 순서에 주의.
		//2. 정상범위가 아니면 현재 balance값 유지
		//밸런스가 음수거나 백만을 넘어가면
		if(balance < 0 || balance > 1000000) return;

		//1.  0 <= balance <=1000000 범위 일 때
		this.balance = balance;
	}


	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재잔고: " + account.getBalance()); //현재잔고10000원

		account.setBalance(-100);
		System.out.println("현재잔고: " + account.getBalance()); //현재잔고10000원

		account.setBalance(2000000);
		System.out.println("현재잔고: " + account.getBalance()); //현재잔고10000원
	
		account.setBalance(300000);
		System.out.println("현재잔고: " + account.getBalance()); //현재잔고300000원
		
	}

}
