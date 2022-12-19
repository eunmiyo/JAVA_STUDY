package test.ch12.GenericInterface;

public class GenericEx {

	public static void main(String[] args) {
		HomeAgency homeAgency = new HomeAgency();
		//return값을 new Home()으로 해줬기 때문에 Home으로 받아야함.
		Home home = homeAgency.rent();
		home.turnOnLight();
		
		CarAgency carAgency = new CarAgency();
		//return값을 new Car()로 해줬기 때문에 Car로 받아야함.
		Car car = carAgency.rent();
		car.run();
	}
 
}
