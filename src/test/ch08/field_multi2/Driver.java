package test.ch08.field_multi2;

public class Driver {
	//메소드
	void drive(Vechicle vechicle) {
		vechicle.run(); //Vechicle 추상메소드 run() 호출
	}
	
	/**
	 * DriverEx driver.drive(bus);
	 * 	void drive(Vechicle vechicle = new Bus 자동형변환) {
		vechicle.run();
		}
	 */
}
