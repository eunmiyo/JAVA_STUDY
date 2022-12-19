package test.ch11.wrapper;

public class ValueCompareEx {

	public static void main(String[] args) {
		Integer obj1 = 300;
		Integer obj2 = 300;
		
		//참조타입은 모두 주소를 가지고 있다
		System.out.println(obj1 == obj2); //주소를 비교
		
		
		System.out.println(obj1.equals(obj2)); //값을 비교
		
		System.out.println("--------------");
		
		/** 
		 * [값을 비교하는 타입]
		 * Byte, Short, Integer, Boolean, Character 
		 * -128 ~ 127 사이에 있으면 값을 비교!
		 */
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println(obj3 == obj4);
		System.out.println(obj3.equals(obj4));

	}

}
