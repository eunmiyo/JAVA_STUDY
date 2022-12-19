package test.ch11.reflection;

public class Car {
	/*
	 * 리플렉션: 메타정보(패키지정보, 타입정보, 멤버-생성자, 필드,메소드)를 프로그램에서 읽고 수정하는 행위
		1. 클래스로부터 얻는 방법
		Class clazz = 클래스이름.class;
		Class clazz = Class.forName("패키지이름.클래스이름");
		2. 객체로부터 얻는 방법
		얻고싶은 객체를 생성 후
		Class clazz = 객체참조변수.getClass();
	 */

	
	public static void main(String[] args) {
//		Class clazz = Car.class;
//		Class clazz = Class.forName("test.ch11.reflection.Car");
		
		Car car = new Car();
		Class clazz = car.getClass();
		
		//getPackage() 패키지정보
		//getSimpleName() 패키지를 제외한 타입 이름
		//getName() 패키지를 포함한 전체 타입 이름
		System.out.println("패키지이름: " + clazz.getPackage().getName());
		System.out.println("클래스의 간단한 이름: " + clazz.getSimpleName());
		System.out.println("클래스의 전체 이름: " + clazz.getName());
		
		

	}

}
