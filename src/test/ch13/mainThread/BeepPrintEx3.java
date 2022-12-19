package test.ch13.mainThread;

import java.awt.Toolkit;

public class BeepPrintEx3 {

	public static void main(String[] args) {
		Thread thread = new Thread() { //상속과 클래스를 동시에!
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
		};
		
		thread.start();
		
		//메인스레드
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); //0.5초 간 일시정지
			} catch(Exception e) {}
		}

	}

}
