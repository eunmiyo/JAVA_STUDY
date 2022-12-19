package test.ch09;

public class AEx {

	public static void main(String[] args) {
		/**
		//외부에서 B클래스를 쓰고싶을 때
		//A를 통해서만 B접근가능하기 때문에 A객체 생성 필요
		//A객체를 생성해야만 B객체를 생성할 수 있다.
		A a = new A();
		
		//.을 이용해 사용
		A.B b = a.new B();
		*/
		
		A a = new A();
		a.useB();
	}

}
