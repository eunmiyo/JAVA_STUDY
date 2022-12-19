package test.ch10;

public class ExceptionEx2 {
	// 실행예외: 컴파일러가 예외처리 코드 여부를 검사하지 않는 예외
	public static void main(String[] args) {
		
		try {
			Class.forName("java.lang.String2"); //주어진 클래스를 찾는 코드
			System.out.println("java.lang.String 클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
