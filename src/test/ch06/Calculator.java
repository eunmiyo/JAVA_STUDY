package test.ch06;

public class Calculator {
	//메소드 오버로딩: 같은 이름의 메소드 여러개를 만든다.
	//매개변수의 타입, 개수, 순서 중 하나가 달라야함!!
	
	double areaRectangle(double width) { //정사각형의 넓이
		return width * width;
	}
	
	double areaRectangle(double width, double height) {//정사각형의 넓이
		return width * height;
	}
	
	
	/*
	//자바에서는 생성자를 명시하지 않으면 컴파일 과정에서 생성자를 생성해 준다.
	//Calculator(){}
	
	//리턴값이 없는 메소드 선언
	//리턴시키는값이 없을 때 void
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
//		return; 생략가능
	}
	
	//리턴값이 없는 메소드 선언
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	//int형으로 리턴값이 있는 메소드
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	//double형으로 리턴값이 있는 메소드
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	*/
}

