package test.ch08.type;

public class PromotionEx {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		A a; //인터페이스 변수 선언
		
		//자동형 변환
		a = b;
		a = c;
		a = d;
		a = e;
		
		/**
		 * interface A(부모) <- implements B(상속) <- extends D(상속)
		 * A <- C <- E 
		 */
	}

}
