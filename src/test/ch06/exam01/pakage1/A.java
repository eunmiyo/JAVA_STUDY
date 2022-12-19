package test.ch06.exam01.pakage1;

//클래스는 public, default 접근제한자를 가질 수 있다.
//default: 아무것도 안 쓴 상태 class A {}
//default: 동일 패키지 내 클래스에서만 사용
//생성자는 public, default, private 접근제한자를 가질 수 있다.
 public class A {
	 public int field1;
	 int field2;
	 private int field3;
	 
	 public A() {
		 //같은 클래스 내라 모두 실행 가능
		 field1 = 1; //o
		 field2 = 1; //o
		 field3 = 1; //o
		 method1(); //o
		 method2(); //o
		 method3(); //o
	 }
	 
	 public void method1() {}
	 void method2() {}
	 private void method3() {}
}

 /*
//private 생성자, 같은 클래스라서 사용 가능
 A a3_private = new A("문자열"); 
 
 public A(boolean b){
	 
 }
 
 A(int b){
	 
 }
 
 A(String s){
	 
 }
*/