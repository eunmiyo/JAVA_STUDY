package test.ch07.Abstract;

public abstract class Animal {
//일반메소드
	public void breathe() {
		System.out.println("숨을 쉽니다");
	}
	
	//추상메소드 선언
	//추상메소드는 자식클래스에서 반드시 오버라이딩 되어야 한다.
	public abstract void sound();
	
	// Final키워드는 상속할 수 없으므로 추상클래스에서 쓸 수 없다.

}

