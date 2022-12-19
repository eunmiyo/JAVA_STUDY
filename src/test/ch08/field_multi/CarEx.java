package test.ch08.field_multi;

public class CarEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		System.out.println("============");
		
		//타이어 객체 교체
		//Car객체 생성에서 .tire1필드 불러와 KumhoTire roll()메소드로 교체
		myCar.tire1 = new KumhoTire();
		myCar.tire2 = new KumhoTire();
		myCar.run();
		
	}

}
