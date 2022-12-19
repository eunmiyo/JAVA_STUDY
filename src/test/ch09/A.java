package test.ch09;

// 중첩클래스 (멤버클래스)

public class A {
	//인스턴스 멤버 클래스
	//인스턴스 객체를 생성해야 사용 가능
	//public, default, private 접근 제한자 사용가능
	class B {
		//필드
		int field1 = 1;
		
		//생성자
		B(){
			System.out.println("B생성자 실행");
		}
		
		//메소드
		void method1() {
			System.out.println("B의 메소드1 실행");
		}
	}
	
	// 메소드
	void useB() {
		B b = new B(); //B생성자 호출
		System.out.println(b.field1); //B필드 출력
		b.method1(); //B메소드 호출
	}
	/**
	//1. 필드로 만들기
	B field = new B();
	
	//2. A클래스 생성자에서 사용 가능
	A(){
		B b = new B();
	}
	
	//3. 메소드에서 사용 가능
	void method() {
		B b = new B();		
	}
	*/
}

