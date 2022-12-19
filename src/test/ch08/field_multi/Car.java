package test.ch08.field_multi;

public class Car {
	//필드
	Tire tire1 = new HankookTire();
	Tire tire2 = new HankookTire();
	
	//메소드
	void run() {
		//HankookTire 오버라이딩된 roll()메소드 불러오기
		tire1.roll();
		tire2.roll();
	}
	
}
