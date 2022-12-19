package test.ch09.noname;

public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.run1();
		car.run2();
		car.run3(new Tire() {

			@Override
			public void roll() {
				System.out.println("스노우 타이어가 굴러갑니다.");
			}
			
		});

	}

}
