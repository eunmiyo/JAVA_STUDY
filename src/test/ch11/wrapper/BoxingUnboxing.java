package test.ch11.wrapper;

public class BoxingUnboxing {

	public static void main(String[] args) {
		//박싱: 기본 타입(primitive type)의 값을 포장 객체로 만드는 것
		Integer obj = 100; 
		
		//언박싱:포장 객체를 기본타입으로 만드는 것
		int value = obj;
		
		//obj는 5와 연산되기 전에 언박싱이 된다.
		int value2 = obj + 5;
		
		//intValue() 값을 리턴할 때 int형으로 되돌려줌
		System.out.println("value: " + obj.intValue());
		System.out.println("value2: " + value2);

	}

}
