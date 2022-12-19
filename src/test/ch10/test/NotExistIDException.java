package test.ch10.test;

public class NotExistIDException extends Exception{
	//생성자
	public NotExistIDException() {}
	
	public NotExistIDException(String message) {
		super(message);
	}
	
}
