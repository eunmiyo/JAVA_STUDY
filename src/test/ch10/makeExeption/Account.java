package test.ch10.makeExeption;

public class Account {
	//필드
	private long balance; //잔고
	
	//생성자
	public Account() {
		
	}
	
	//메소드
	public long getBalance() {
		return balance;
	}
	
	//저금
	public void deposit(int money) {//money: 저금하려는 돈
		balance += money; //잔고에 돈을 누적 합산
	}
	
	//출금
	public void withdraw(int money) throws InsufficientException { //money: 출금하려는 돈
		//잔고보다 내가 출금하려는 돈이 더 크면 예외 발생
		if(balance < money) {
			throw new InsufficientException("잔고 부족: " + (money - balance) + "원이 부족합니다.");
		}
		
		balance -= money; //잔고에서 출금하려는 돈을 빼줌
	}
}
