package test.ch12.WildCard;

/*
 * 와일드 카드 타입 파라메터
 * ?는 범위에 있는 모든 타입으로 대체할 수 있다.
 * 리턴타입 메소드명(제네릭타입<?> 변수){...}
 * <Object> <Integer> <String> 모든 클래스, 인터페이스 가능
 * 
 * 자식클래스와 자기 자신만 사용 가능
 * 리턴타입 메소드명(제네릭타입<? extends 클래스이름> 변수){...}
 * 
 * 부모클래스와 자기 자신만 사용 가능
 * 리턴타입 메소드명(제네릭타입<? super 클래스이름> 변수){...}
 */

public class Course {
	//모든 사람이 수강신청 가능
	public static void registerCourse1(Applicant<?> applicant) {
		//해당클래스의 이름을 가져온다.
		System.out.println(applicant.kind.getClass().getSimpleName() + "이 Course1을 등록");
	}
	
	//학생만 수강신청 가능
	//자기 자신과 하위 클래스만 제네릭타입으로 사용 가능
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이 Course2을 등록");
	}
	
	//직장인 및 일반인만 수강신청 가능
	//부모클래스와 자기 자신만 사용 가능
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + "이 Course3을 등록");
	}
	
}
