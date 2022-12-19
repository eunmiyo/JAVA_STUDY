package test.ch06.exam01.pakage1;

public class B {
	public void method() {
		A a = new A();
		
		//private만 실행 안됨
		a.field1 = 1; //o
		a.field2 = 1; //o
//		a.field3 = 1; //x
		a.method1(); //o
		a.method2(); //o
//		a.method3(); //x
	}

}


/*
//A a = new A(); A클래스(default) 접근 가능, 동일 패키지 내 클래스에서만 사용

A a1_public = new A(true);

A a2_default = new A(1);

A a3_private = new A("문자열"); //private라서 안됨, 같은 클래스 안에서만 가능
*/