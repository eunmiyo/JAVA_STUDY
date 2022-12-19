package test.ch11.annotation;

public class Service {
	//필드
	String test;
	
	//생성자
	Service(){}
	
	//메소드
	//적용할 곳 바로 위에 @PrintAnnotation 붙여주기
	
	@PrintAnnotation //default에 주는 값이 적용됨
	public void method1() {
		System.out.println("method1");
	} 
	
	@PrintAnnotation(value="#")
	public void method2() {
		System.out.println("method2");
	}
	
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("method3");
	}
}
