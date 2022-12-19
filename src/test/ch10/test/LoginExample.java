package test.ch10.test;

public class LoginExample {

	public static void main(String[] args) {
		try { //실행할 코드
			login("White", "12345");
		} catch(Exception e) { //에러가 났을 때 실행시키는 코드
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}	
	
	public static void login(String id, String password) throws Exception{
		//id가 blue가 아니라면 NotExistIDException을 발생시킴
		if(!id.equals("blue")) {
			System.out.println("아이디가 존재하지 않습니다.");
		}
		
		//id가 blue가 아니라면 WrongPasswordException을 발생시킴
		if(!password.equals("12345")) {
			System.out.println("패스워드가 틀립니다.");
		}
	}
	
}
