package test.ch13.mainThread;

import java.awt.Toolkit;

public class BeepPrintEx4 extends Thread{
	/*
	 * 스레드 실행을 위한 인터페이스 방법
	 * Thread클래스를 상속받아 생성
	 * 오버라이드 실행
	 * run(): 실제 스레드가 실행되는 코드
	 */
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep(); // 빔소리를냄
			try {
				Thread.sleep(500); //0.5초 간 일시정지
			} catch(Exception e) {}
		}	
	}
	
	public static void main(String[] args) {
		Thread thread = new BeepPrintEx4();
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); //0.5초 간 일시정지
			} catch(Exception e) {}
		}
	}

}
