package singletone;

/*
 * singletone
 * 객체는 하나만 생성해서 공유할 때 
 */
public class Printer {
	//필드
	//static을 붙인 이유: 객체를 생성하지 않아도 되서
	private static Printer printer = null;
	
	//1. 생성자는 private 접근제한자로 바꿔준다.
	//-> 외부에서 객체 생성을 못함
	private Printer() {
		
	}
	
	//메소드
	//2. 싱글톤 구현
	public static Printer getPrinter() {
		//printer객체가 null이면 Printer객체 생성
		if(printer == null) {
			printer = new Printer();
		}
		
		/*
		 * 이미 printer객체가 생성이 되어있으면
		 * 나중에는 이미 생성된 printer객체가 리턴된다.
		 */
		return printer;
	}
}
