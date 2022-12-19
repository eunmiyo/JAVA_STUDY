package test.ch13.sync;
/*
 * 스레드가 사용중이 객체를 다른 스레드가 변경할 수 없도록 하려면
 * 스레드에 작업이 끝날 때까지 객체에 잠금을 걸면 된다.
 * 이를 위해 자바는 메소드동기화(synchronized)
 * 메소드 블록을 제공한다.
 */

public class Calculator {
	//필드
	private int memory;

	public int getMemory() {
		return memory;
	}
	
	//메소드에 동기화 걸기 
	//접근제한자 synchronized 타입 변수명(){}
	public synchronized void setMemory1(int memory) {
		
		this.memory = memory;
		try {
			Thread.sleep(2000); //2초간 정지
		} catch (InterruptedException e) {}
		
		 /*
		  * currentThread()
		  * -> 현재 실행되고 있는 메인스레드를 얻어온다.
		  */
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	
	}
	
	//코드 블록에 동기화 걸기(내가 동기화를 원하는 코드 범위 선택)
	//synchronized (this){내가 동기화를 원하는 코드 범위}
	public void setMemory2(int memory) {
		synchronized (this) {
			this.memory = memory;
			try {
				Thread.sleep(2000); //2초간 정지
			} catch (InterruptedException e) {}
			
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
	}	
}
