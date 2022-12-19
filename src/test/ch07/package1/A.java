package test.ch07.package1;

/*
 protected : 동일 패키지 내 클래스 또는 상속 클래스에서 사용
 (필드, 생성자, 메소드)
 */
public class A {
	//필드
	protected String field;
	
	//생성자
	protected A() {}
	
	//메소드
	protected void method() {}
}
