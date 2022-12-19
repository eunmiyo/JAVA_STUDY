package test.ch13.sync;

//Thread클래스를 상속받아 멀티스레드 실행
public class User1Thread extends Thread {
	private Calculator calculator;
	
	public User1Thread() {
		setName("user1Thread"); //스레드의 이름 변경
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	/*
	 * Thread는 Runnable(익명인터페이스)로 구현하게 된다.
	 * -> 그러므로 Runnable에 속해있는 run()메소드를 오버라이딩 할 수 있다.
	 * 스레드가 실행될 때 실행되는 코드
	 */
	@Override
	public void run() {
		/*
		 * Calculator에서
		 * setMemory1(int memory)메소드 실행
		 */
		calculator.setMemory1(100);
	}

}
