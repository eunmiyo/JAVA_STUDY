package test.ch10;

public class ThrowsEx {

	public static void main(String[] args) {
		try {
			findClass(); //메소드를 호출한 곳에서 예외처리
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	
	//리턴타입메소드명(매개변수) throws
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}

}
