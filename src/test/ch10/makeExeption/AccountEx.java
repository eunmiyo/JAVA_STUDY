package test.ch10.makeExeption;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account();
		
		//저금
		account.deposit(10000); //10000원 저금
		System.out.println("예금액: " + account.getBalance()); //잔고
		
		//출금
		try {
			account.withdraw(30000); //30000원 출금
		} catch (InsufficientException e) {
			String message = e.getMessage(); //에러메세지 받기
			System.out.println(message);
		} 

	}

}
