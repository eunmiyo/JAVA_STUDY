package test.ch08;

public interface RemoteControl {
	/* 인터페이스란?
	 * 다중상속처럼 만들기 위해 나온 인터페이스
	 * 인터페이스에서는 메소드 명칭과 변수만 선언
	 * implements 에서는 무조건 오버라이드 해주고, 구현메소드 작성
	 * 추상메소드와 상수만 가질 수 있다.
	 */
	//인터페이스에 선언된 필드는 모두 public static final 특성을 갖는다.
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//public 추상메소드
	//인터페이스 안에서만 public이 없어도 컴파일 과정에서 public abstract가 자동으로 붙는다.
	//-> 추상메소드 이므로!
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//default 메소드: 인터페이스에서 실행 메소드를 구현하고 싶을 때 사용
	default void setMute(boolean mute) { //음소거
		if(mute) { //true
			System.out.println("음소거 처리 합니다.");
			setVolume(MIN_VOLUME); 
		}else { //false
			System.out.println("음소거 해제.");
		}
	}
	
	//정적(static)메소드
	//코드를 구현할 수 있다.
	//public이 없어도 컴파일 과정에서 public이 자동으로 붙는다.
	static void changeBattery() {
		System.out.println("건전지 교체.");
	}
}
