package test.ch13.mainThread;

import java.awt.Toolkit;

/*
 * Class Toolkit
 * -> Abstract Window Toolkit의 모든 실제 구현의 추상 슈퍼클래스
 */
public class BeepPrintEx { //소리5번 나오고, 띵문자열5번출력

	public static void main(String[] args) {
		/*
		 * Toolkit은 new 타입()으로 객체를 생성할 수 없어서
		 * Toolkit.getDefaultToolkit()으로 생성
		 */
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //getDefaultToolkit()
		for(int i=0; i<5; i++) {
			toolkit.beep(); // 빔소리를냄
			try {
				Thread.sleep(500); //0.5초 간 일시정지
			} catch(Exception e) {}
		}
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				/*
				 * Thread.sleep(long millis)
				 * 시스템 타이머 및 스케줄러의 정확도에 따라 
				 * 현재 실행 중인 스레드를 지정된 밀리초 동안 
				 * 휴면 상태(일시적으로 실행 중지)로 만듭니다.
				 */
				Thread.sleep(500); //0.5초 간 일시정지
			} catch(Exception e) {}
		}

	}

}
