package test.ch07.poly;

public class CarEx {

	public static void main(String[] args) {
//		public Car myCar;
		//객체를 생성해 준다!
		Car myCar = new Car();
		
		//Tire객체를 넣어준다.
		
		myCar.tire = new Tire();
		myCar.run();
		myCar.tire = new HankookTire();
		myCar.run();
		myCar.tire = new KumhoTire();
		myCar.run();
	}

}
