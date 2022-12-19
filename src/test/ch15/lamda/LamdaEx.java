package test.ch15.lamda;

public class LamdaEx {
	/*
	 * 인터페이스의 익명 구현 객체를 람다식으로 표현하려면
	 * 인터페이스가 단 하나의 추상메소드만 가져야 한다!!
	 */
	public static void main(String[] args) {
		/**
		 action(new Calculable() {
		@Override
		public void calculate(int x, int y) { //하위클래스+오버라이드
			System.out.println(x-y);
			}	
		});
		 */
		
		/*
		//람다식
		//메소드((매개변수, 매개변수) -> {실행문});
		action((x, y) -> {
			System.out.print("결과: ");
			System.out.println(x+y);
		});
		
		//실행문이 하나일 경우 중괄호 생략 가능
		action((x, y) -> System.out.println(x-y));		 
		 */
		
		//매개변수가 하나일 때는 괄호 생략 가능
//		action(x -> System.out.println(x));
		
		//매개변수가 없을 때
		action();
		

	}
	
	public static void action() {
		int x = 10;
		int y = 4;
//		calculable.calculate(x,y);
//		calculable.calculate(x);
		Calculable calc = () -> {System.out.println(x+y);};
		calc.calculate();
	}

}
