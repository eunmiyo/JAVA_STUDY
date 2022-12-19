package test.ch08.type2;

public class CastEx {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();//자동타입변환
		
		vehicle.run();
		System.out.println("=============");
		
		//자동타입변환이 일어나고 강제타입변환이 일어난다!
		//강제형변환: 자식한테 부모를 담는다
		Bus bus = (Bus)vehicle;//강제형변환
		bus.run();
		bus.checkFare();
		
//		//객체생성
//		Bus bus = new Bus();
//		Taxi taxi = new Taxi();
//		
//		//bus, taxi로 매개변수를 주는건 자동타입변환
//		//static으로 만들어 바로 가져다 쓸 수 있음 
//		ride(bus); //false
//		ride(taxi); //true
//		
	}
	
	//instanceof 강제타입변환 전 자동타입이 되어있는지 확인!
	public static void ride(Vehicle vehicle) {
		//Vehicle객체가 Bus객체를 가지고 있니?
		//-> Vehicle vehicle = new Bus();
		if(vehicle instanceof Bus) {
			Bus bus = (Bus)vehicle;
			bus.checkFare();
		}
	}

}
