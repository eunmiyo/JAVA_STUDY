package test.ch06;

public class CalculatorEX {

	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		
		double result1 = myCalc.areaRectangle(10);
		System.out.println(result1);
		
		double result2 = myCalc.areaRectangle(10, 20);
		System.out.println(result2);
		
		}
	}

		
		
		/*
		//객체 생성
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
		
		//메소드 리턴타입(int), 매소드이름(result1), 매개변수(plus(5, 6))
		int result1 = myCalc.plus(5, 6);
		System.out.println(result1);
		
		//divide(int x, int y) 같은 타입!
		int x = 10, y = 4; 
		double result2 = myCalc.divide(x, y);
		System.out.println(result2);
		
		myCalc.powerOff();
		 */


