package test.ch07.poly2;

public class Bus extends Vehicle {

	/**
	 * Override 란?
	 * 부모 클래스와 자식 클래스에서만 쓸 수 있다
	 * 부모 클래스에 선언된 함수를 자식 클래스에서 다른 동작으로 하도록 재정의 한다
	 */
	@Override
	public void run() {
		System.out.println("타요버스가 달립니다.");
	}

}
