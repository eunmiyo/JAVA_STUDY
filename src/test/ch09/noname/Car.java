package test.ch09.noname;

public class Car {
	//필드에 Tire객체 대입
	//필드에서 익명 자식 개체 사용
	private Tire tire1 = new Tire();
	private Tire tire2 = new Tire() { //이름없는 클래스 + 상속 + 자동 형변환

		@Override
		public void roll() { 
			System.out.println("한국 타이어가 굴러갑니다.");
		}
		
	};
	
	//메소드
	public void run1() {
		tire1.roll();
		tire2.roll();
	}
	
	public void run2() {
		//로컬 변수에 익명 자식 객체 사용
		Tire tire = new Tire() {

			@Override
			public void roll() {
			System.out.println("금호 타이어가 굴러갑니다.");
			}
		};
		tire.roll();
	}
	
	//메소드에서 (매개변수) 이용
	public void run3(Tire tire) {
		tire.roll();
	}
}
