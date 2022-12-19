package test.ch07;

// D ->(부모) B ->(부모) A
// E ->(부모) C ->(부모) A 
class A {}

class B extends A {}

class C extends A {}

class D extends B {}

class E extends C {}

public class PromotionEx {

	public static void main(String[] args) {
		//객체생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		//자동타입변환
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
//		B b3 = e; //상속관계에 있지 않으면 자동타입변환을 할수가 없다.
//		C c2 = d;
		

	}

}
