package test.ch12.extend;

public class GenericEx {
/*
 * 제한된 타입 파라메터
 * 특정 타입과 자식 관계에 있는 타입만 대체할 수 있는 타입 파라미터
 * public <T extends 상위타입> 리턴타입 메소드(매개변수, ...){...}
 */
	//doubleValue()
	//-> 타입제한으로 Number가 가지고 있는 메소드도 사용 가능
	//Number타입 안에 abstract double doubleValue() 추상메소드로 가지고 있고,
	//double doubleValue()
	public static <T extends Number> boolean compare(T t1, T t2) {
		double v1 = t1.doubleValue(); //Number의 doubleValue()메소드 사용가능
		double v2 = t2.doubleValue(); //abstract double
		return (v1 == v2);
	}
	public static void main(String[] args) {
		boolean result1 = compare(10, 20);
		System.out.println(result1);

		boolean result2 = compare(4.5, 4.5);
		System.out.println(result2);
	}

}
