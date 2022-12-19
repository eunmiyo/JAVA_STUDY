package test.ch08.field_multi2;

public class DriverEx {

	public static void main(String[] args) {
		//객체 생성
		Driver driver = new Driver();		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//Driver에서 drive메소드 호출
		driver.drive(bus); //버스가 달립니다
		driver.drive(taxi); //택시가 달립니다
	}

}
