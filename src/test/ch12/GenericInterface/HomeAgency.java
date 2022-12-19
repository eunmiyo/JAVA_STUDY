package test.ch12.GenericInterface;

public class HomeAgency implements Rentable<Home> {

	@Override
	public Home rent() {
		return new Home(); //Home객체를 리턴
	}
	
}
