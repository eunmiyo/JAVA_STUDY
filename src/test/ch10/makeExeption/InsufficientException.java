package test.ch10.makeExeption;

//사용자 정의 예외 클래스
public class InsufficientException extends Exception{
	//생성자
	public InsufficientException() {
		
	}
	
	public InsufficientException(String message) {
		super(message);
	}
}
