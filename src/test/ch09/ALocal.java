package test.ch09;

//로컬 클래스

public class ALocal {
	//메소드
	void useB(int arg) {//final int arg와 같은
		
		//로컬 변수
		int var = 1; //final int var와 같은
		
		class B {
			//인스턴스 필드
			int field = 1;
			
			//생성자
			B(){
				System.out.println("B생성자 실행");
			}
			
			//인스턴스 메소드
			void method() {
				System.out.println("B메소드 실행");
			}
			
			/*
			void method2() {
				//중첩된 클래스안에서는 변경불가!!
				arg = 2;
				var = 3;
			}
			*/
		}
		//메소드안에서 생성가능!
		//메소드가 실행할 때만 B객체를 생성할 수 있다!
		B b = new B();
		System.out.println(b.field);
		b.method();
	}
}
