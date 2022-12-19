package test.ch07.poly2;

public class Driver {
	//메소드(매개변수로 다형성을 구현한다.)
	//매개변수(vehicle)를 부모타입(Vehicle)으로 선언!
	
	public void drive(Vehicle vehicle) {
//		Vehicle vehicle = new Bus(); 자동타입변환
		vehicle.run();
	}
}
