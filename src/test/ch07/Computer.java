package test.ch07;

public class Computer extends Calculator{
	//오버라이드: 부모클래스의 메소드를 재정의(반환타입, 메소드 이름, 매개변수가 모두 같아야 한다.
	
	@Override
	public double areaCircle(double r) {
		return Math.PI * r * r;
	}	


}
