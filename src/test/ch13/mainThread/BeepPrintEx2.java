package test.ch13.mainThread;

import java.awt.Toolkit;

public class BeepPrintEx2 {

	public static void main(String[] args) {
		/*
		 * 스레드 실행을 위한 인터페이스 방법
		 * Runnable인터페이스로 구현(익명인터페이스)
		 * 인터페이스이므로 오버라이드 실행
		 * 익명객체는 run()메소드 하나
		 * 메인스레드가 동시에 진행
		 */
		Thread thread = new Thread(new Runnable() {			
			//run(): 실제 스레드가 실현되는 코드
			@Override
			public void run() {
				//메인스레드
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep(); // 빔소리를냄
					try {
						Thread.sleep(500); //0.5초 간 일시정지
					} catch(Exception e) {}
				}	
			}
		});
		
		thread.start(); //start()가 있어야 스레드가 실행!
		
		//메인스레드
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); //0.5초 간 일시정지
			} catch(Exception e) {}
		}

	}

}
