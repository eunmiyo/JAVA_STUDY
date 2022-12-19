package test.ch07;

//부모클래스
//public final class Airplane
//클래스 앞에 final을 붙이면 그 클래스는 부모 클래스로 사용할 수 없다.
public class Airplane {
	//메소드
	public void land() {
		System.out.println("착륙");
	}
	//public final void fly(){}
	//메소드에 final을 붙이면 그 메소드는 오버라이드 할 수 없다.
	public void fly() {
		System.out.println("일반 비행");
		
	}
	public void takeOff() {
		System.out.println("이륙");
		
	}
}
