package test.ch07;

//Supersonic: 초음속
public class SupersonicAirplane extends Airplane {
	//상수(static final), 대문자
	public static final int NOMAL = 1;
	public static final int SUPERSONIC = 2;
	
	//필드
	public int flyMode = NOMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행");
		}else {//NOMAL일때
			//super.메소드명() -> 부모클래스의 메소드 실행
			super.fly();			
		}
	}
	
	
}
