package test.ch09.outer;

public class A {
	//A클래스의 인스턴스 필드와 메소드
	int field1;
	void method1() {}
	
	//A클래스의 정적 필드와 메소드
	static int field2;
	static void method2() {}
	
	//인스턴스 멤버 클래스
	class B {
		void method() {
			//A클래스의 인스턴스 필드와 메소드
			field1 = 10; //접근가능
			method1(); //접근가능
			
			//A클래스의 정적 필드와 메소드
			field2 = 10; //접근가능
			method2(); //접근가능			
		}
	}
	
	//정적 멤버 클래스
	static class C {
		void method() {
	//A클래스의 인스턴스 필드와 메소드
	//정적 멤버 클래스에서는 
	//바깥클래스의 인스턴스 필드와 메소드에는 접근 할 수 없다.
//		field1 = 10; //접근 불가능
//		method1(); //접근 불가능
			
	//A클래스의 정적 필드와 메소드
		field2 = 10; //접근가능
		method2(); //접근가능		
		}
	}
}
