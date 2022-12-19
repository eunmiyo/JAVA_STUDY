package test.temp;

public class Temp01 {
	public static String val1 = "나는 static 이다";
	
	/**
	 * static 으로 선언된 변수, 함수를 참조하거나 호출할 때 최초에 1번만 실행된다
	 * 초기값 설정 등을 구현하면 좋다
	 * 
	 */
	static {
		System.out.println("static 실행된다");
		init();
	}
	
	/**
	 * 초기값 설정
	 */
	public static void init() {
		//초기값 설정 
	}
}
