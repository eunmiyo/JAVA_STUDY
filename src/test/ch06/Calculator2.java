package test.ch06;

public class Calculator2 {
	//객체 = 필드(속성) , 메소드(함수)
	//클래스를 구성하는 멤버(필드, 메소드)
	/*
	double pi = 3.14159; : 인스턴스가 생성되어야 저장된다.
	Calculator2 calc2 = new Calculator2(); : 인스턴스
	*/
	
	//1.필드
	//static: 정적멤버, static영역에 따로 저장
	 static double pi = 3.14159;
	 static String model = "calc1";
	 static String number = "1";
	 static String info;
	 
	 //static블록: static필드에 대한 초기화 작업이 필요할 때 사용
	 static {
		 info = model + "_" + number; //calc1_1
	 }
	
	//2.메소드
	 static int plus(int x, int y) {
		return x + y;
	}
	
	 static int minus(int x, int y) {
		return x - y;
	}
}
