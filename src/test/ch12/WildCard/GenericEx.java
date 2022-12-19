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

public class GenericEx {

	public static void main(String[] args) {
		//모든 사람이 신청
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		System.out.println("");
		
		//학생만 신청
		//자식클래스와 자기 자신만 사용 가능
//		Course.registerCourse2(new Applicant<Person>(new Person()));
//		Course.registerCourse2(new Applicant<Worker>(new Worker()));
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		System.out.println("");
		
		//직장인 및 일반인 신청
		//부모클래스와 자기 자신만 사용 가능
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
//		Course.registerCourse3(new Applicant<Student>(new Student()));
//		Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
//		Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));

	}

}
