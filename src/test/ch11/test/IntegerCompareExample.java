package test.ch11.test;

public class IntegerCompareExample {

	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		// -127 ~ 128 범위안에서는 값을 비교
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3.equals(obj4));

	}

}
