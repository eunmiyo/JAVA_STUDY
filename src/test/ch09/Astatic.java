package test.ch09;

//중첩클래스(멤버클래스)

public class Astatic {
	//정적 멤버 클래스
	//정적 객체를 생성하지 않아도 사용 가능
	//public, default, private 접근 제한자 사용가능
	
	static class B {
		//필드
		int field1 = 1;
		//생성자
		B(){
			System.out.println("B생성자 실행");
		}
		//메소드
		void method1() {
			System.out.println("B메소드 실행");
		}
	}
	
	//1. 인스턴스 필드로 사용
	static B field = new B();
	
	//2. 생성자에서 사용
	Astatic() {
		B b = new B();
	}
	
	//3. 인스턴스 메소드에서 사용가능
	void method1() {
		B b = new B();	
	}
	
	//4. 정적 메소드에서 사용가능
	static void method2() {
		B b = new B();	
	}
}
