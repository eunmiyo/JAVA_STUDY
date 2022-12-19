package test.ch12.GenericInterface;

public class CarAgency implements Rentable<Car> {

	@Override
	public Car rent() { 
		return new Car(); //Car객체를 리턴
	}
	
}
