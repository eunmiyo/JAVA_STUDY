package test.ch06.exam01.pakage2;

import test.ch06.exam01.pakage1.A;
import test.ch06.exam01.pakage1.B;

//import test.ch06.exam01.pakage1.A;

public class C {
	public C() {
		A a = new A();
		
		//private, default 실행 안됨
		a.field1 = 1; //o
//		a.field2 = 1; //x
//		a.field3 = 1; //x
		a.method1(); //o
//		a.method2(); //x
//		a.method3(); //x
	}
	
}

/*
//A a = new A(); //A클래스(default) 접근 불가, import해도 안됨
//B a = new B(); //B클래스(public) 접근 가능, 모든 타 클래스 import해서 사용

A a1_public = new A(true);

//A a2_default = new A(1); //default 동일 패키지 내 클래스에서만 가능

//A a3_private = new A("문자열"); //private 오직 해당 클래스 내에서만 가능
*/