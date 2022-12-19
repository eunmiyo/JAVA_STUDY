package test.ch06;

public class Earth {
	//자바에서의 상수
	//불변의 값(final), 공유해서 사용 가능(static)
	//ex) 원주율:3.14.., 지구둘레
	
	
	//상수(변수명은 대문자로, 스네이크로 쓴다(_))
	//final: 절대 변경안됨, static:전역변수, 어디서든 가능
	static final double EARTH_RADIUS = 6400; //반지름
	static final double EARTH_SURFACE_AREA; //표면적
	
	//static블록 : static 초기화
	static {
		//지구표면적구하는 공식
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
}
