package test.ch06.test;

import java.util.Scanner;

public class BankApplication23 {
	//스캐너 객체 생성
	private static Scanner scanner = new Scanner(System.in);
	//계좌객체를 담을 배열(100개까지, 초기값=null)
	private static Account23[] accountArray = new Account23[100];
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			clear(5);
			System.out.println("+----------------------------------------------------+");
			System.out.println("| 1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료 |");
			System.out.println("+----------------------------------------------------+");
			int selectNum = getUserInputInt("선택> ");
			switch(selectNum) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
				break;
			}
		}	
		System.out.println("프로그램 종료");
	}
	
	/**
	 * 빈 줄 입력
	 * @param val
	 */
	public static void clear(int val) {
		for (int i=0; i<val; i++) {
			System.out.println();
		}
	}
	
	/**
	 * 문자열 입력받아 반환
	 * @param str
	 * @return
	 */
	public static String getUserInput(String str) {
		System.out.print(str);
		return scanner.next();
	}
	
	/**
	 * 정수 입력받아 반환
	 * @param str
	 * @return
	 */
	public static int getUserInputInt(String str) {
		System.out.print(str);
		return scanner.nextInt();
	}
	
	//static이 있어야 main 메소드에서 바로 호출 가능
	//객체를 생성하지 않고 메소드를 사용하기 위해 static
	//1.계좌생성
	public static void createAccount() {
		System.out.println("+----------+");
		System.out.println("| 계좌생성 |");
		System.out.println("+----------+");
		
		String ano = getUserInput(" 계좌번호: ");
		String owner = getUserInput(" 계좌주: ");
		int balance = getUserInputInt(" 초기입금액: ");
		
		Account23 newAccount = new Account23(ano, owner, balance); //계좌만듦
		
		for(int i=0; i<accountArray.length; i++) {
			//accountArray에서 빈방을 찾아 값을 넣는다.
			if(accountArray[i] == null) {
				//생성한 계좌를 배열에 넣어준다.
				accountArray[i] = newAccount;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break; //계좌를 넣고 for 반복문을 끝낸다.
			}
		}
	}
	
	//2.계좌목록
	public static void accountList() {
		System.out.println("+----------------------------------------------------+");
		System.out.println("|                      계좌목록                      |");
		System.out.println("+----------------------------------------------------+");
		
		int accountCount = 0;
		String message = "";
		
		for(int i=0; i<accountArray.length; i++) {
			Account23 newAccount = accountArray[i];
			if(newAccount != null) { // 계좌가 있으면
				accountCount++;
				//format예시 : [1 번째 계좌] 111-111   aa   1000
				/*
				System.out.println(
					String.format(" [%d %s] %s   %s   %s",
						accountCount,
						"번째 계좌",
						newAccount.getAno(),
						newAccount.getOwner(),
						newAccount.getBalance()
						)
					);
				*/
				
				message = " [" + accountCount + " 번째 계좌]";
				message += " " + newAccount.getAno();
				message += "   " + newAccount.getOwner();
				message += "   " + newAccount.getBalance();
				
				System.out.println(message);
			}
		}
		
		System.out.println("+----------------------------------------------------+");
	}
	
	//3.예금
	public static void deposit() {
		System.out.println("+----------+");
		System.out.println("|   예금   |");
		System.out.println("+----------+");
		
		String ano = getUserInput(" 계좌번호: ");
		int balance = getUserInputInt(" 예금액: ");
		
		//입력받은 계좌번호로 계좌를 찾고(findAccount 메소드 이용)
		//찾은 계좌에서 getBalance() 로 가져오고
		Account23 account23 = findAccount(ano);
		
		//setBalance(getBalance() + balance) 에 입력받은 예금액을 더한다
//		account23.setBalance(account.getBalance() + 예금액)
		if (account23 != null) {
			//입력받은 예금액을 잔액에 더한다.
			account23.setBalance(account23.getBalance() + balance);
			System.out.println(balance + "원 입금되었습니다.");
		}
	}
	
	//4.출금
	public static void withdraw() {
		System.out.println("+----------+");
		System.out.println("|   출금   |");
		System.out.println("+----------+");
		
		String ano = getUserInput(" 계좌번호: ");
		int balance = getUserInputInt(" 출금액: ");
		
		//입력받은 계좌번호를 찾는다.
		Account23 account23 = findAccount(ano);
		
		//계좌를 못찾았다면 account23 변수는 null 이다.
		//account23 변수가 null 이면 NullpointException 이 발생한다.
		//따라서, if 문을 사용하여 null 인지 확인하다.
		if (account23 != null) {
			//입력받은 출금액을 잔액에서 뺀다.
			account23.setBalance(account23.getBalance() - balance);
			System.out.println(balance + "원 출금되었습니다.");
		}
	}
	
	//5. accountArray배열에서 ano(계좌)와 동일한 Account23객체 찾는 역할을 한다.
	private static Account23 findAccount(String ano) {

		//찾은 계좌를 리턴	
		Account23 account23 = null;
		
		for(int i=0; i<accountArray.length; i++) {
			if (accountArray[i] != null) { //null이 아니면 계좌가 있다.
				//불러온 계좌안에 있는 계좌번호와 매개변수로 받아온 계좌번호 ano가 같은지 체크 
				String abAno = accountArray[i].getAno();
				
				if(abAno.equals(ano)) { //.equals() 값을 비교
					account23 = accountArray[i];
					//매개변수로 받아온 계좌를 찾았다.
					//더 이상 비교할 필요가 없다.
					//반복문을 벗어나겠다.
					break;
				}
			}
		}
		
		//처음 선언한 것과 같이 account23 변수에 null 값이 있다면,
		//매개변수로 받아온 계좌를 찾지 못한 것이다
		if (account23 == null) {
			System.out.println("계좌 확인 필요!!!!"); //잘못된 계좌 입력 시 화면에 출력
		}
		
		return account23;
	
	}
}


/*
 if(selectNum ==1) createAccount();
 else if (selectNum ==2)accountList();
 else if (selectNum ==3)deposit();
else if (selectNum ==4)withdraw();
else if (selectNum ==5) run=false;
 */
