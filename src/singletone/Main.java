package singletone;

public class Main {

	public static void main(String[] args) {
		//user객체를 담을 배열을 정의
		User[] user = new User[10];
		
		//user객체를 생성해서 user[]배열에 사용자이름을 넣어준다.
		for(int i=0; i<user.length; i++) {
			user[i] = new User("user" + i); // user0, user1, ...
			user[i].print(); //생성한 객체에서 printer()메소드 실행
		}

	}

}
