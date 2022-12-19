package test.ch12.method;

public class GenericEx {
/*
 * 제네릭 메소드
 * public<A, B ...> 리턴타입 메소드명(매개변수, ...){...}
 * 리턴타입, 메소드를 동시에 적용하므로 두개 의 타입은 일치해야한다!!
 * public static <T> Box<T> boxing(T t) {}
 */
	public static <T> Box<T> boxing(T t) {
		Box<T> box =  new Box<T>();
		box.set(t);
		return box;
	}
	
	public static void main(String[] args) {
		//제네릭 메소드 호출: T를 Integer로 대체
		Box<Integer> box1 = boxing(515);
		int intValue = box1.get();
		System.out.println(intValue);
		
		Box<String> box2 = boxing("전은미");
		String strValue = box2.get();
		System.out.println(strValue);
	}

}
