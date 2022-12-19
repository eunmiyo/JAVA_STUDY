package test.ch07.poly2;

public class DriverEx {

	public static void main(String[] args) {
		//객체 생성
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		
		//Vehicle vehicle = new Bus(); 자동타입변환
		/*
		 * driver변수는 Driver객체로 생성이 되었다
		 * driver변수안에 있는 drive함수를 호출한다.
		 * bus변수는 Bus객체로 생성이 되었다
		 * Bus객체는 Vehicle클래스의 자식클래스이다.
		 * drive함수의 매개변수로 bus변수를 넘긴다.
		 */
		driver.drive(bus);
		
		Taxi taxi = new Taxi();
		//driver객체의 drive함수에 taxi객체를 준다
		driver.drive(taxi);
		

	}

}
