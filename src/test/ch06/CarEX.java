package test.ch06;

public class CarEX {

	public static void main(String[] args) {
		//1.객체 생성
		//객체가 생성되어야 값이 들어간다.
		Car myCar = new Car();
		
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		System.out.println(myCar.speed);
		System.out.println(myCar.numbering);
//		System.out.println(myCar.start);
		System.out.println("============");
		
		
		Car car2 = new Car();
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.maxSpeed);
		System.out.println(Car.numbering);
		System.out.println("============");
		
		Car car3 = new Car();
		System.out.println(car3.model);
		System.out.println(car3.color);
		System.out.println(car3.maxSpeed);
		System.out.println(Car.numbering);
		System.out.println("============");
		
		Car car4 = new Car();
		System.out.println(Car.numbering);
	}

}
